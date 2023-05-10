package com.projetobackend.dslist.repositories;

import com.projetobackend.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
