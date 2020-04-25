package com.storage;

import com.character.CharacterInformation;

import java.util.Collection;
import java.util.UUID;

public interface CharacterStorage {
	UUID storeNewCharacter(CharacterInformation characterInformation);

	CharacterInformation getCharacter(UUID characterId);

	void removeCharacter(UUID characterId);

	Collection<CharacterInformation> getAll();
}
