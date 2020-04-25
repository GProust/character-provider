package com.character;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class CharacterInformation {

	private final String firstName;
	private final String lastName;
	private final LocalDate birthDate;
	private final Integer age;
}
