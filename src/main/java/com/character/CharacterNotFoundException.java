package com.character;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
class CharacterNotFoundException extends CharacterException {

	CharacterNotFoundException(final String message) {
		super(message);
	}
}
