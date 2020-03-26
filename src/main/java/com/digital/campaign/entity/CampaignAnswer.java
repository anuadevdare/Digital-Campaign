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
@Table(name = "TM_CAMPAIGN_ANSWER")
public class CampaignAnswer implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The unique question identifier within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CAMPAIGN_ANSWER_ID", columnDefinition = "BIGINT", length = 20, nullable = false)
	private long campaignAnswerId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CAMPAIGN_RESPONSE_ID", nullable = false)
	private CampaignResponse campaignResponseId;
	/**
	 * The unique response identifier tied to a question within a campaign
	 */
	@Column(name = "answerId", columnDefinition = "BIGINT", length = 20, nullable = false)
	private long answerId;

	public CampaignAnswer() {
		super();
	}

	public long getCampaignAnswerId() {
		return campaignAnswerId;
	}

	public void setCampaignAnswerId(long campaignAnswerId) {
		this.campaignAnswerId = campaignAnswerId;
	}

	public CampaignResponse getCampaignResponseId() {
		return campaignResponseId;
	}

	public void setCampaignResponseId(CampaignResponse campaignResponseId) {
		this.campaignResponseId = campaignResponseId;
	}

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	@Override
	public String toString() {
		return "CampaignAnswer [campaignAnswerId=" + campaignAnswerId + ", campaignResponseId=" + campaignResponseId
				+ ", answerId=" + answerId + "]";
	}
}
