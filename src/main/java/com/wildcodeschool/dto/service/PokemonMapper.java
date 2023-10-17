package com.wildcodeschool.dto.service;

import com.wildcodeschool.dto.dto.PokemonDTO;
import com.wildcodeschool.dto.entity.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class PokemonMapper {
    public static PokemonDTO TransformPokemonEntityInPokemonDto(Pokemon pokemon) {
        PokemonDTO pokemonDTO = new PokemonDTO();
        pokemonDTO.setName(pokemon.getName());
        pokemonDTO.setAttribute(pokemon.getAttribute());
        return pokemonDTO;
    }

    public Pokemon TransformPokemonDtoInPokemonEntity(PokemonDTO pokemonDTO) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(pokemonDTO.getName());
        pokemon.setAttribute(pokemonDTO.getAttribute());
        return pokemon;
    }
}
