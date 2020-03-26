package com.digital.campaign.dto;

public class AnswerDto {

	private long answerId;

	/**
	 * The response options available for a question in the native language.
	 */
	private String answerText;

	public AnswerDto() {
		super();
	}

	/**
	 * @param answerId
	 * @param responseOption
	 */
	public AnswerDto(long answerId, String answerText) {
		super();
		this.answerId = answerId;
		this.answerText = answerText;
	}	

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	@Override
	public String toString() {
		return "AnswerDto [answerId=" + answerId + ", answerText=" + answerText + "]";
	}

}
