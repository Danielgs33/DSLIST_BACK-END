package com.daniel_dev.DsList_backEnd.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel_dev.DsList_backEnd.dto.GameMinDTO;
import com.daniel_dev.DsList_backEnd.entities.Games;
import com.daniel_dev.DsList_backEnd.repositories.GameRepository;

@Service
public class GameService {

@Autowired 
private GameRepository gameRepository;
    
public List<GameMinDTO> findAll() {
    List<Games> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
}
}
