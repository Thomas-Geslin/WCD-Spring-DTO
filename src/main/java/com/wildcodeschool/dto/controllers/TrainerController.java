package com.wildcodeschool.dto.controllers;

import com.wildcodeschool.dto.dto.TrainerDTO;
import com.wildcodeschool.dto.entity.Trainer;
import com.wildcodeschool.dto.repository.TrainerRepository;
import com.wildcodeschool.dto.service.TrainerMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainerController {
    public final TrainerRepository trainerRepository;

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @PostMapping("/trainer")
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @GetMapping("/trainer/{id}")
    public ResponseEntity<?> getTrainerMappers(@PathVariable long id) {
        TrainerDTO trainer = TrainerMapper.TransformTrainerEntityInTrainerDto(trainerRepository.findById(id).get());
        return new ResponseEntity<>(trainer, HttpStatus.OK);
    }
}
