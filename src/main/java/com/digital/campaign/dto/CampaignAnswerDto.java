package com.digital.campaign.dto;

public class CampaignAnswerDto {

	/**
	 * The unique question identifier within a campaign
	 */
	private long questionId;

	/**
	 * The unique answer identifier tied to a question within a campaign
	 */
	private long answerId;

	public CampaignAnswerDto() {
		super();
	}

	/**
	 * @param questionId
	 * @param answerId
	 */
	public CampaignAnswerDto(long questionId, long answerId) {
		super();
		this.questionId = questionId;
		this.answerId = answerId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	@Override
	public String toString() {
		return "CampaignAnswerDto [questionId=" + questionId + ", answerId=" + answerId + "]";
	}

}
