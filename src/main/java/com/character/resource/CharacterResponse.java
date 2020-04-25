package com.character.resource;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder(access = AccessLevel.PRIVATE)
@Getter
public class CharacterResponse {

	private final String firstName;
	private final String lastName;
	private final LocalDate birthDate;
	private final Integer age;

	static CharacterResponse from(final Character character) {
		return builder()
				.firstName(character.getFirstName())
				.lastName(character.getLastName())
				.age(character.getAge())
				.birthDate(character.getBirthDate())
				.build();
	}
}
