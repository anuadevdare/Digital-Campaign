package com.digital.campaign.dto;

import java.util.Date;

public class CampaignListDto {
	private long campaignId;

	private String name;

	private String description;

	/**
	 * To maintain start date of the campaign as defined in TechPulse
	 */
	private Date startDate;

	/**
	 * To maintain end date of the campaign as defined in TechPulse
	 */
	private Date endDate;

	private long companyId;

	/**
	 * 
	 */
	public CampaignListDto() {
		super();
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	
}
