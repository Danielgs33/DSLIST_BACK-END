package com.daniel_dev.DsList_backEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel_dev.DsList_backEnd.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
    
}
