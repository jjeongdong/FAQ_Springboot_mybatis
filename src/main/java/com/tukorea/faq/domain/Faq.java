package com.tukorea.faq.domain;

public class Faq {
	private int faqSeq; // faq 시퀀스
	private String category; // 카테고리
	private String question; // 질문
	private String answer; // 답변
	private String regDt; // 등록일시
	
	public int getFaqSeq() {
		return faqSeq;
	}
	public void setFaqSeq(int faqSeq) {
		this.faqSeq = faqSeq;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	
	
}
