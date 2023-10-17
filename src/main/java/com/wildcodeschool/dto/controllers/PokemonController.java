package com.wildcodeschool.dto.controllers;

import com.wildcodeschool.dto.dto.PokemonDTO;
import com.wildcodeschool.dto.entity.Pokemon;
import com.wildcodeschool.dto.repository.PokemonRepository;
import com.wildcodeschool.dto.service.PokemonMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {
    public final PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @PostMapping("/pokemons")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @GetMapping("/pokemons/{id}")
    public ResponseEntity<?> getPokemonMappers(@PathVariable long id) {
        PokemonDTO pokemonDto = PokemonMapper.TransformPokemonEntityInPokemonDto(pokemonRepository.findById(id).get());
        return new ResponseEntity<>(pokemonDto, HttpStatus.OK);
    }
}