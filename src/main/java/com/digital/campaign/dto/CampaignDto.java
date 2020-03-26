package com.digital.campaign.dto;

import java.util.Collection;
import java.util.Date;

public class CampaignDto {

	private long campaignId;

	private String name;

	private String description;

	private String status;
	/**
	 * To maintain start date of the campaign as defined in TechPulse
	 */
	private Date startDate;

	/**
	 * To maintain end date of the campaign as defined in TechPulse
	 */
	private Date endDate;

	private long companyId;

	private long noOfDevices;
	
	private String createdBy;
	
	private Date createdDate;
	
	private Date actualEndDate;

	private Collection<QuestionDto> questionList;

	public CampaignDto() {
		super();
	}
	
	/**
	 * @param campaignId
	 * @param name
	 * @param description
	 * @param status
	 * @param startDate
	 * @param endDate
	 * @param companyId
	 * @param noOfDevices
	 * @param createdBy
	 * @param createdDate
	 * @param actualEndDate
	 */
	public CampaignDto(long campaignId, String name, String description, String status, Date startDate, Date endDate,
			long companyId, long noOfDevices, String createdBy, Date createdDate, Date actualEndDate) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companyId = companyId;
		this.noOfDevices = noOfDevices;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.actualEndDate = actualEndDate;
	}


	/**
	 * @param campaignId
	 * @param name
	 * @param description
	 * @param status
	 * @param startDate
	 * @param endDate
	 * @param companyId
	 * @param noOfDevices
	 * @param createdBy
	 * @param createdDate
	 * @param actualEndDate
	 * @param questionList
	 */
	public CampaignDto(long campaignId, String name, String description, String status, Date startDate, Date endDate,
			long companyId, long noOfDevices, String createdBy, Date createdDate, Date actualEndDate,
			Collection<QuestionDto> questionList) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companyId = companyId;
		this.noOfDevices = noOfDevices;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.actualEndDate = actualEndDate;
		this.questionList = questionList;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public long getNoOfDevices() {
		return noOfDevices;
	}

	public void setNoOfDevices(long noOfDevices) {
		this.noOfDevices = noOfDevices;
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

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public Collection<QuestionDto> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Collection<QuestionDto> questionList) {
		this.questionList = questionList;
	}

	@Override
	public String toString() {
		return "CampaignDto [campaignId=" + campaignId + ", name=" + name + ", description=" + description
				+ ", questionList=" + questionList + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", companyId=" + companyId + "]";
	}

}
