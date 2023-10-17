package com.wildcodeschool.dto.service;

import com.wildcodeschool.dto.dto.TrainerDTO;
import com.wildcodeschool.dto.entity.Trainer;
import org.springframework.stereotype.Service;

@Service
public class TrainerMapper {
    public static TrainerDTO TransformTrainerEntityInTrainerDto(Trainer trainer) {
        TrainerDTO trainerDTO = new TrainerDTO();
        trainerDTO.setName(trainer.getName());
        trainerDTO.setPokemons(trainer.getPokemons());
        return trainerDTO;
    }

    public Trainer TransformTrainerStoInTrainerEntity(TrainerDTO trainerDTO) {
        Trainer trainer = new Trainer();
        trainer.setName(trainerDTO.getName());
        trainer.setPokemons(trainerDTO.getPokemons());
        return trainer;
    }
}
