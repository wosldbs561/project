package com.docmall.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnailator;

public class FileUtils {

	//파일업로드 작업
	// String uploadFoler : C:\\dev\\upload\\pds
	// String uploadDateFolder : 2023\\05\\12
	// MultipartFile uploadFile : 업로드되는 파일
	public static String uploadFile(String uploadFolder, String uploadDateFolder, MultipartFile uploadFile) {
		
		String uploadFileName = ""; // 실제 업로드한 파일이름
		
		// File클래스 : 파일과 폴더관련 작업을 지원하는 기능.  날짜폴더 생성
		
		File uploadFolderPath = new File(uploadFolder, uploadDateFolder);
		
		// 1)날짜폴더생성  C:\\dev\\upload\\pds 폴더에 2023\\05\\12 날짜폴더가 존재하지 않으면
		if(uploadFolderPath.exists() == false) {
			uploadFolderPath.mkdirs();
		}
		
		// 2)클라이언트에서 업로드한 파일명.
		String uploadClientFileName = uploadFile.getOriginalFilename();
		
		// 3)실제 업로드 할 파일명 생성(중복되지 않는 고유한 파일명이어야 한다.)
		UUID uuid = UUID.randomUUID();
		
		uploadFileName = uuid.toString() + "_" + uploadClientFileName;
		
		try {
			// 업로드할 파일객체생성
			File saveFile = new File(uploadFolderPath, uploadFileName);
			// 파일업로드(파일복사)
			uploadFile.transferTo(saveFile);
			
			// Thumnail 작업
			if(checkImageType(saveFile)) {
				//객체생성이 되면, 파일이 생성된다.
				// 클라이언트 파일명: abc.gif  -> C:\\dev\\upload\\pds\\2023\\05\\12\\s_abc.gif   0 byte 파일생성
				FileOutputStream thumnail = new FileOutputStream(new File(uploadFolderPath, "s_" + uploadFileName));
				
				//원본이미지 파일을 입력스트림을 이용하여, 읽고 0byte 파일에 내용을 쓴다. 
				// 너비 100, 높이 100 크기로 한다.
				Thumbnailator.createThumbnail(uploadFile.getInputStream(), thumnail, 100, 100);
				
				thumnail.close();
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return uploadFileName;
	}
	
	// 날짜폴더 생성을위한 날짜정보
	public static String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		
		String str = sdf.format(date);
		
		/*
		 예> 2023-05-12
		 1)리눅스 또는 Mac 구분자 /  -->  2023/05/12  
		 2)윈도우즈 \             -->  2023\05\12
		 */
		
		return str.replace("-", File.separator);
	}
	
	// 업로드되는 파일구분(이미지파일, 일반파일)
	private static boolean checkImageType(File saveFile) {
		
		boolean isImage = false;
		
		try {
			// MIME : text/html, text/plain, image/jpeg
			String contentType = Files.probeContentType(saveFile.toPath());
			
			// contentType변수의 MIME 문자열이 image문자열로 시작되는 지 여부?
			isImage = contentType.startsWith("image");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isImage;
	}
	
	// 상품이미지를 바이트배열로 읽어오는 작업.
	public static ResponseEntity<byte[]> getFile(String uploadPath, String fileName) throws IOException {
		
		ResponseEntity<byte[]> entity = null;
		
		File file = new File(uploadPath, fileName);
		
		// <img src="test.gif">,  <img src="이미지파일에 대한 byte[]">
		
		// 해당 상품이미작 존재하지 않은 경우.
		if(!file.exists()) return entity;
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", Files.probeContentType(file.toPath()));  //  images/jpeg
		
		entity = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.OK);
		
		return entity;
		
	}
	
	// 파일삭제
	public static void deleteFile(String uploadPath, String folderName, String fileName) {
		
		// File.separatorChar : 실행환경의 운영체제에 따라 구분자가 상대적으로 반환된다. 예)윈도우즈 \, 리눅스 /
		
		//원본 상품이미지 삭제
		new File((uploadPath + folderName + "/" + fileName).replace('/', File.separatorChar)).delete();

		//썸네일 상품이미지 삭제
		new File((uploadPath + folderName + "/" + "s_" + fileName).replace('/', File.separatorChar)).delete();
	}
	
	
	
	
	
	
	
}
