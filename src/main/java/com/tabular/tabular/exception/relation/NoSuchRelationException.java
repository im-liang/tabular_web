package com.tabular.tabular.exception.relation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Relation")  // 404
public class NoSuchRelationException extends RuntimeException {

	public NoSuchRelationException(String message) {
		super(message);
	}

	public NoSuchRelationException(String message, Throwable cause) {
		super(message, cause);
	}

}