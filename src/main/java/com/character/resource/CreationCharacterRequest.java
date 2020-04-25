package com.character.resource;

import com.character.CharacterInformation;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@ToString
public class CreationCharacterRequest {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Integer age;

	CharacterInformation toCharacter() {
		return CharacterInformation.builder()
				.firstName(firstName)
				.lastName(lastName)
				.age(age)
				.birthDate(birthDate)
				.build();
	}

}
