package com.digital.campaign.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

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

	@Column(name = "CreatedBy", nullable = false)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate")
	private Date createdDate;
	
	@Column(name = "noOfDevices", columnDefinition = "BIGINT", length = 20)
	private long noOfDevices;
	
	@OneToMany(mappedBy = "campaignId", cascade = CascadeType.ALL)
	private Collection<Question> questionList;

	public Campaign() {
		super();
	}

	/**
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 * @param actualEndDate
	 * @param companyId
	 */
	public Campaign(String name, String description, Date startDate, Date endDate,long companyId,long noOfDevices ) {
		super();
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.companyId = companyId;
		this.noOfDevices=noOfDevices;
	}
	/**
	 * @param campaignId
	 * @param name
	 * @param description
	 * @param status
	 * @param startDate
	 * @param endDate
	 * @param actualEndDate
	 * @param companyId
	 * @param createdBy
	 * @param createdDate
	 * @param noOfDevices
	 * @param questionList
	 */
	public Campaign(long campaignId, String name, String description, String status, Date startDate, Date endDate,
			Date actualEndDate, long companyId, String createdBy, Date createdDate, long noOfDevices,
			Collection<Question> questionList) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.actualEndDate = actualEndDate;
		this.companyId = companyId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.noOfDevices = noOfDevices;
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

	public Collection<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Collection<Question> questionList) {
		this.questionList = questionList;
	}
	
	public long getNoOfDevices() {
		return noOfDevices;
	}
	
	public void setNoOfDevices(long noOfDevices) {
		this.noOfDevices = noOfDevices;
	}
	
	public void addQuestion(Question question) {
		if (question != null) {
			if (questionList == null) {
				questionList = new HashSet<>();
			}
			question.setCampaignId(this);
			questionList.add(question);
		}
	}

	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", name=" + name + ", description=" + description + ", status="
				+ status + ", startDate=" + startDate + ", endDate=" + endDate + ", actualEndDate=" + actualEndDate
				+ ", companyId=" + companyId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", questionList=" + questionList + "]";
	}	
}
