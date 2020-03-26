package com.digital.campaign.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
/**
 *EntityNotFoundException through the exception, if the entity 
 *not present in the database
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public EntityNotFoundException(String message) {
		super(message);
	}
}