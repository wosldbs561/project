package com.mall.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.mall.dto.StatChartDTO;

public interface StatChartService {

	public List<StatChartDTO> firstCategoryOrderPrice();
	
	public JSONObject firstCategoryChart();
}
