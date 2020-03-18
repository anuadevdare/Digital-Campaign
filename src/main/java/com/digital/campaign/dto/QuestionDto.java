package com.digital.campaign.dto;

import java.util.Collection;

public class QuestionDto {

	/**
	 * The unique question identifier within a campaign
	 */
	private long questionId;

	private String questionText;

	private String optionType;
	
	private Collection<ResponseDto> responseList;
	
	public QuestionDto() {
		super();
	}

	/**
	 * @param questionId
	 * @param questionText
	 * @param optionType
	 * @param responseList
	 */
	public QuestionDto(long questionId, String questionText, String optionType, Collection<ResponseDto> responseList) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.optionType = optionType;
		this.responseList = responseList;
	}

	/**
	 * @param questionText
	 * @param optionType
	 */
	public QuestionDto(String questionText, String optionType) {
		super();
		this.questionText = questionText;
		this.optionType = optionType;
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
	public Collection<ResponseDto> getResponseList() {
		return responseList;
	}

	public void setResponseList(Collection<ResponseDto> responseList) {
		this.responseList = responseList;
	}

	@Override
	public String toString() {
		return "QuestionDto [questionId=" + questionId + ", questionText=" + questionText + ", optionType=" + optionType
				+ ", responseList=" + responseList + "]";
	}

}
