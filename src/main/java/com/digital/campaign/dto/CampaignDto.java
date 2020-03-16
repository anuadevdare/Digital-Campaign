package com.digital.campaign.dto;

import java.util.Date;

public class CampaignDto {

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

	/**
	 * To maintain to have values only when Status equal to Stopped or Ended
	 */
	private Date actualEndDate;

	private long companyId;

	/**
	 * @param campaignId
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 * @param actualEndDate
	 * @param companyId
	 */
	public CampaignDto(long campaignId, String name, String description, Date startDate, Date endDate,
			Date actualEndDate, long companyId) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.actualEndDate = actualEndDate;
		this.companyId = companyId;
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

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "CampaignDto [campaignId=" + campaignId + ", name=" + name + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", actualEndDate=" + actualEndDate
				+ ", companyId=" + companyId + "]";
	}

}
