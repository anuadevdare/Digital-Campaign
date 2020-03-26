package com.digital.campaign.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

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
@Table(name = "TM_QUESTION")
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The unique question identifier within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QUESTION_ID")
	private long questionId;

	/**
	 * The unique campaign identifier of the campaign across TechPulse
	 */
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CAMPAIGN_ID")
	private Campaign campaignId;

	@Column(name = "QUESTION_TEXT", nullable = false)
	private String questionText;

	@Column(name = "OPTION_TYPE", nullable = false, length = 25)
	private String optionType;
	
	/**
	 * To give the unique position in the campaign
	 */
	@Column(name = "QUESTION_POSITION",nullable = false)
	private int questionPosition;

	@OneToMany(mappedBy = "questionId", cascade = CascadeType.ALL)
	private Collection<Answer> responseList;

	public Question() {
		super();
	}


	/**
	 * @param questionId
	 * @param campaignId
	 * @param questionText
	 * @param optionType
	 * @param questionPosition
	 * @param responseList
	 */
	public Question(long questionId, Campaign campaignId, String questionText, String optionType, int questionPosition,
			Collection<Answer> responseList) {
		super();
		this.questionId = questionId;
		this.campaignId = campaignId;
		this.questionText = questionText;
		this.optionType = optionType;
		this.questionPosition = questionPosition;
		this.responseList = responseList;
	}

	/**
	 * @param questionText
	 * @param optionType
	 */
	public Question(long questionId,String questionText, String optionType,int questionPosition) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.optionType = optionType;
		this.questionPosition = questionPosition;
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
	
	public int getQuestionPosition() {
		return questionPosition;
	}

	public void setQuestionPosition(int questionPosition) {
		this.questionPosition = questionPosition;
	}


	public Collection<Answer> getResponseList() {
		return responseList;
	}

	public void setResponseList(Collection<Answer> responseList) {
		this.responseList = responseList;
	}
	public void addResponse(Answer response) {
		if (response != null) {
			if (responseList == null) {
				responseList = new HashSet<>();
			}
			response.setQuestionId(this);
			responseList.add(response);
		}
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", campaignId=" + campaignId + ", questionText=" + questionText
				+ ", optionType=" + optionType + ", questionPosition=" + questionPosition + ", responseList="
				+ responseList + "]";
	}
	
}
