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
@Table(name = "TM_Campaign")
public class Campaign implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CampaignId", columnDefinition = "BIGINT", length = 10)
	private long campaignId;
	
	@Column(name = "ClassVersion", length = 8, nullable = false)
	private String classVersion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateTime", nullable = false)
	private Date dateTime;

	@Column(name = "Name", nullable = false)
	private String name;

	@Column(name = "Description")
	private String description;
	/**
	 * To maintain The various states of a campaign
	 */
	@Column(name = "Status", length = 16, nullable = false)
	private String status;

	/**
	 * To maintain start date of the campaign as defined in TechPulse
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "StartDate", nullable = false)
	private Date startDate;

	/**
	 * To maintain end date of the campaign as defined in TechPulse
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EndDate", nullable = false)
	private Date endDate;

	/**
	 * To maintain to have values only when Status equal to Stopped or Ended
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ActualEndDate")
	private Date actualEndDate;

	@Column(name = "CompanyId", nullable = false)
	private long companyId;

	@Column(name = "CeatedBy", nullable = false)
	private String ceatedBy;

	@OneToMany(mappedBy = "campaignId", cascade = CascadeType.ALL)
	private Collection<Question> questionList;

	public Campaign() {
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

	public String getCeatedBy() {
		return ceatedBy;
	}

	public void setCeatedBy(String ceatedBy) {
		this.ceatedBy = ceatedBy;
	}

	public Collection<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Collection<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", classVersion=" + classVersion + ", dateTime=" + dateTime
				+ ", name=" + name + ", description=" + description + ", status=" + status + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", actualEndDate=" + actualEndDate + ", companyId=" + companyId
				+ ", ceatedBy=" + ceatedBy + ", questionList=" + questionList + "]";
	}

	
}
