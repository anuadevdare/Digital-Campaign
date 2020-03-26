package com.digital.campaign.dto;

import java.util.Collection;

public class QuestionDto {

	/**
	 * The unique question identifier within a campaign
	 */
	private long questionId;

	private String questionText;

	private String optionType;
	
	private int questionPosition;
	
	private Collection<AnswerDto> responseList;
	
	public QuestionDto() {
		super();
	}
	
	/**
	 * @param questionText
	 * @param optionType
	 */
	public QuestionDto(long questionId,String questionText, String optionType,int questionPosition) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.optionType = optionType;
		this.questionPosition=questionPosition;
	}


	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}
	
	public int getQuestionPosition() {
		return questionPosition;
	}

	public void setQuestionPosition(int questionPosition) {
		this.questionPosition = questionPosition;
	}

	public Collection<AnswerDto> getResponseList() {
		return responseList;
	}

	public void setResponseList(Collection<AnswerDto> responseList) {
		this.responseList = responseList;
	}

	@Override
	public String toString() {
		return "QuestionDto [questionId=" + questionId + ", questionText=" + questionText + ", optionType=" + optionType
				+ ", questionPosition=" + questionPosition + ", responseList=" + responseList + "]";
	}

}
