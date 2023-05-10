package com.projetobackend.dslist.services;

import com.projetobackend.dslist.dto.GameDTO;
import com.projetobackend.dslist.dto.GameListDTO;
import com.projetobackend.dslist.dto.GameMinDTO;
import com.projetobackend.dslist.entities.Game;
import com.projetobackend.dslist.entities.GameList;
import com.projetobackend.dslist.repositories.GameListRepository;
import com.projetobackend.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component //Ou @Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
