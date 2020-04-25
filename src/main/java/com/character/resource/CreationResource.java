package com.character.resource;

import com.character.CharacterException;
import com.character.CharacterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping(path = "/character")
public class CreationResource {

	@Autowired
	private CharacterService characterService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UUID createCharacter(@RequestBody final CreationCharacterRequest characterRequest) throws CharacterException {
		return characterService.create(characterRequest.toCharacter());
	}

	@GetMapping(path = "{characterId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CharacterResponse getCharacter(@PathVariable final UUID characterId) throws CharacterException {
		return CharacterResponse.from(characterService.get(characterId));
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CharacterResponse> getCharacters() {
		return characterService.getAll().stream().map(CharacterResponse::from).collect(Collectors.toList());
	}
}
