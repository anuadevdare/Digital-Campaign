package com.digital.campaign.dto;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

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

	private long companyId;

	private long noOfDevices;

	private Collection<QuestionDto> questionList;

	public CampaignDto() {
		super();
	}

	/**
	 * @param name
	 * @param description
	 * @param questionList
	 * @param startDate
	 * @param endDate
	 * @param actualEndDate
	 * @param companyId
	 */
	public CampaignDto(String name, String description, Collection<QuestionDto> questionList, Date startDate,
			Date endDate, long companyId) {
		super();
		this.name = name;
		this.description = description;
		this.questionList = questionList;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companyId = companyId;
	}

	/**
	 * @param campaignId
	 * @param name
	 * @param description
	 * @param questionList
	 * @param startDate
	 * @param endDate
	 * @param actualEndDate
	 * @param companyId
	 */
	public CampaignDto(long campaignId, String name, String description, Set<QuestionDto> questionList,
			Date startDate, Date endDate, long companyId) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.questionList = questionList;
		this.startDate = startDate;
		this.endDate = endDate;
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
