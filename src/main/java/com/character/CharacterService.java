package com.character;

import java.util.List;
import java.util.UUID;

public interface CharacterService {

	UUID create(CharacterInformation character) throws CharacterException;

	CharacterInformation get(UUID characterId) throws CharacterException;

	List<CharacterInformation> getAll();
}
