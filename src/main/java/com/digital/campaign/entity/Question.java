package com.digital.campaign.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TM_Question")
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The unique question identifier within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QuestionId")
	private long questionId;

	/**
	 * The unique campaign identifier of the campaign across TechPulse
	 */
	@JsonIgnore
	@JoinColumn(name = "campaignId", nullable = false)
	@ManyToOne
	private Campaign campaignId;

	@Column(name = "QuestionText", nullable = false)
	private String questionText;

	@Column(name = "OptionType", nullable = false, length = 25)
	private String optionType;

	@OneToMany(mappedBy = "questionId", cascade = CascadeType.ALL)
	private Collection<Response> responseList;

	public Question() {
		super();
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public Campaign getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Campaign campaignId) {
		this.campaignId = campaignId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public Collection<Response> getResponseList() {
		return responseList;
	}

	public void setResponseList(Collection<Response> responseList) {
		this.responseList = responseList;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", campaignId=" + campaignId + ", questionText=" + questionText
				+ ", optionType=" + optionType + ", responseList=" + responseList + "]";
	}

}
