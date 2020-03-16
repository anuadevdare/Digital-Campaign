package com.digital.campaign.dto;

public class CampaignAnswersDto {

	/**
	 * The unique question identifier within a campaign
	 */
	private long questionId;

	
	/**
	 * The unique response identifier tied to a question within a campaign
	 */
    private long responseID;


	/**
	 * @param questionId
	 * @param responseID
	 */
	public CampaignAnswersDto(long questionId, long responseID) {
		super();
		this.questionId = questionId;
		this.responseID = responseID;
	}


	public long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}


	public long getResponseID() {
		return responseID;
	}


	public void setResponseID(long responseID) {
		this.responseID = responseID;
	}


	@Override
	public String toString() {
		return "CampaignAnswersDto [questionId=" + questionId + ", responseID=" + responseID + "]";
	}

}
