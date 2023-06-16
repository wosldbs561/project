package com.mall.mapper;

import java.util.List;
import java.util.Map;

import com.mall.dto.StatChartDTO;

public interface StatChartMapper {

	public List<StatChartDTO> firstCategoryOrderPrice();
	
	public List<Map<String, Object>> firstCategoryChart();
}
