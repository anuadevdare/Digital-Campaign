package com.digital.campaign.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TM_Response")
public class Response implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The unique response identifier tied to a question within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ResponseId")
	private long responseId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "questionId", nullable = false)
	private Question questionId;
	/**
	 * The response options available for a question in the native language.
	 */
	@Column(name = "ResponseOption", nullable = false)
	private String responseOption;
	
	public Response() {
		super();
	}

	public long getResponseId() {
		return responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	public String getResponseOption() {
		return responseOption;
	}

	public void setResponseOption(String responseOption) {
		this.responseOption = responseOption;
	}

	@Override
	public String toString() {
		return "Response [responseId=" + responseId + ", questionId=" + questionId + ", responseOption="
				+ responseOption + "]";
	}

	
}
