package com.character;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CharacterException extends Exception {

	public CharacterException(final String message) {
		super(message);
	}
}
