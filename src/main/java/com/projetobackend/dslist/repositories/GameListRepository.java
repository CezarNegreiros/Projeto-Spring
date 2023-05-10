package com.projetobackend.dslist.repositories;

import com.projetobackend.dslist.entities.Game;
import com.projetobackend.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
