package com.character;

import com.storage.CharacterStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CharacterInternalService implements CharacterService {

	@Autowired
	private CharacterStorage characterStorage;

	@Override
	public UUID create(final CharacterInformation characterInformation) throws CharacterException {
		if (characterAlreadyExist(characterInformation)) {
			throw new CharacterException("The character already exist");
		}
		return characterStorage.storeNewCharacter(characterInformation);
	}

	@Override
	public CharacterInformation get(final UUID characterId) throws CharacterException {
		final CharacterInformation characterInformation = characterStorage.getCharacter(characterId);
		if (characterInformation != null) {
			return characterInformation;
		}
		throw new CharacterNotFoundException(String.format("The id [%s] of the character does not exist", characterId));
	}

	@Override
	public List<CharacterInformation> getAll() {
		return new ArrayList<>(characterStorage.getAll());
	}

	private boolean characterAlreadyExist(final CharacterInformation characterInformation) {
		return false;
	}
}
