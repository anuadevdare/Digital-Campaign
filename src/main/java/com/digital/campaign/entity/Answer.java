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
@Table(name = "TM_ANSWER")
public class Answer implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The unique response identifier tied to a question within a campaign
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ANSWER_ID")
	private long answerId;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "QUESTION_ID")
	private Question questionId;
	
	/**
	 * The response options available for a question in the native language.
	 */
	@Column(name = "ANSWER_TEXT", nullable = false)
	private String answerText;
	
	public Answer() {
		super();
	}

	/**
	 * @param answerId
	 * @param questionId
	 * @param answerText
	 */
	public Answer(long answerId, Question questionId, String answerText) {
		super();
		this.answerId = answerId;
		this.questionId = questionId;
		this.answerText = answerText;
	}

	/**
	 * @param answerId
	 * @param answerText
	 */
	public Answer(long answerId, String answerText) {
		super();
		this.answerId = answerId;
		this.answerText = answerText;
	}

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public long getResponseId() {
		return answerId;
	}

	public void setResponseId(long responseId) {
		this.answerId = responseId;
	}

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", questionId=" + questionId + ", answerText=" + answerText + "]";
	}

}
