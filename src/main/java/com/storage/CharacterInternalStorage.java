package com.storage;

import com.character.CharacterInformation;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class CharacterInternalStorage implements CharacterStorage {

	private final Map<UUID, CharacterInformation> internalStorage = new HashMap<>();

	@Override
	public UUID storeNewCharacter(final CharacterInformation characterInformation) {
		final UUID uuid = UUID.randomUUID();
		internalStorage.put(uuid, characterInformation);
		return uuid;
	}

	@Override
	public CharacterInformation getCharacter(final UUID characterId) {
		return internalStorage.get(characterId);
	}

	@Override
	public void removeCharacter(final UUID characterId) {
		internalStorage.remove(characterId);
	}

	@Override
	public Collection<CharacterInformation> getAll() {
		return internalStorage.values();
	}
}