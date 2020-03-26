package com.digital.campaign.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TM_CAMPAIGN_RESPONSE")
public class CampaignResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * The unique campaign identifier of the campaign across TechPulse
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CAMPAIGN_RESPONSE_ID", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long campaignResponseId;
	
	@Column(name = "CAMPAIGN_ID", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long campaignId;
	
	/**
	 * The unique company identifier across TechPulse
	 */
	@Column(name = "COMAPNY_ID",columnDefinition = "BIGINT",length=10, nullable = false)
	private long companyId;
	
	/**
	 * The unique user identifier across TechPulse
	 */
	@Column(name = "USER_ID", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long userId;
	
	/**
	 * The unique device identifier across TechPulse
	 */
	@Column(name = "DEVICE_ID", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long deviceId;
	
	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@OneToMany(mappedBy = "campaignResponseId", cascade = CascadeType.ALL)
	private Collection<CampaignAnswer> answerList;

	public CampaignResponse() {
		super();
	}

	public long getCampaignResponseId() {
		return campaignResponseId;
	}

	public void setCampaignResponseId(long campaignResponseId) {
		this.campaignResponseId = campaignResponseId;
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Collection<CampaignAnswer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(Collection<CampaignAnswer> answerList) {
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "CampaignResponse [campaignResponseId=" + campaignResponseId + ", campaignId=" + campaignId
				+ ", companyId=" + companyId + ", userId=" + userId + ", deviceId=" + deviceId + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", answerList=" + answerList + "]";
	}

}
