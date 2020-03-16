package com.digital.campaign.dto;

public class QuestionDto {

	/**
	 * The unique question identifier within a campaign
	 */
	private long questionId;

	private String questionText;

	private String optionType;

	/**
	 * @param questionId
	 * @param questionText
	 * @param optionType
	 */
	public QuestionDto(long questionId, String questionText, String optionType) {
		super();
		this.questionId = questionId;
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

	@Override
	public String toString() {
		return "QuestionDto [questionId=" + questionId + ", questionText=" + questionText + ", optionType=" + optionType
				+ "]";
	}

}
