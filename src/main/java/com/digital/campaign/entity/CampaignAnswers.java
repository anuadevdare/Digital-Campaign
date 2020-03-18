package com.digital.campaign.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TM_CampaignAnswers")
public class CampaignAnswers implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The unique question identifier within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CampaignAnswersId", columnDefinition = "BIGINT", length = 20, nullable = false)
	private long campaignAnswersId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "campaignResponseId", nullable = false)
	private CampaignResponse campaignResponse;
	/**
	 * The unique response identifier tied to a question within a campaign
	 */
	@Column(name = "ResponseID", columnDefinition = "BIGINT", length = 20, nullable = false)
	private long responseID;
	
	public CampaignAnswers() {
		super();
	}

	public long getCampaignAnswersId() {
		return campaignAnswersId;
	}



	public void setCampaignAnswersId(long campaignAnswersId) {
		this.campaignAnswersId = campaignAnswersId;
	}



	public CampaignResponse getCampaignResponse() {
		return campaignResponse;
	}

	public void setCampaignResponse(CampaignResponse campaignResponse) {
		this.campaignResponse = campaignResponse;
	}

	public long getResponseID() {
		return responseID;
	}

	public void setResponseID(long responseID) {
		this.responseID = responseID;
	}

	@Override
	public String toString() {
		return "CampaignAnswers [campaignAnswersId=" + campaignAnswersId + ", campaignResponse=" + campaignResponse
				+ ", responseID=" + responseID + "]";
	}
	
}
