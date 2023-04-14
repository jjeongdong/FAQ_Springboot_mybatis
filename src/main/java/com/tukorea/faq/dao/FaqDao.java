package com.tukorea.faq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.tukorea.faq.domain.Faq;

@Mapper
public interface FaqDao {
// 카테고리 목록 조회
	public String[] selectFaqCategory();

// FAQ 목록 총 건수 조회
	public int selectFaqListTotalCount(Map<String, Object> paramMap);

// FAQ 목록 조회
	public List<Faq> selectFaqList(Map<String, Object> paramMap);
}