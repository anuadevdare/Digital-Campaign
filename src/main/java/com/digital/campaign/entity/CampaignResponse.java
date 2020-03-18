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
@Table(name = "TM_CampaignResponse")
public class CampaignResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * The unique campaign identifier of the campaign across TechPulse
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CampaignResponseId", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long campaignResponseId;
	
	@Column(name = "CampaignId", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long campaignId;
	
	@Column(name = "ClassVersion", length = 8, nullable = false)
	private String classVersion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateTime", nullable = false)
	private Date dateTime;
	
	/**
	 * The unique company identifier across TechPulse
	 */
	@Column(name = "CompanyId",columnDefinition = "BIGINT",length=10, nullable = false)
	private long companyId;
	
	/**
	 * The unique user identifier across TechPulse
	 */
	@Column(name = "UserId", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long userId;
	
	/**
	 * The unique device identifier across TechPulse
	 */
	@Column(name = "DeviceId", columnDefinition = "BIGINT", length = 20,nullable = false)
	private long deviceId;

	@OneToMany(mappedBy = "campaignResponse", cascade = CascadeType.ALL)
	private Collection<CampaignAnswers> answerList;

	public CampaignResponse() {
		super();
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public String getClassVersion() {
		return classVersion;
	}

	public void setClassVersion(String classVersion) {
		this.classVersion = classVersion;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
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

	public Collection<CampaignAnswers> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(Collection<CampaignAnswers> answerList) {
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "CampaignResponse [campaignId=" + campaignId + ", classVersion=" + classVersion + ", dateTime="
				+ dateTime + ", companyId=" + companyId + ", userId=" + userId + ", deviceId=" + deviceId
				+ ", answerList=" + answerList + "]";
	}
	
	
}
