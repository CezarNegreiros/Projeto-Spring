package com.projetobackend.dslist.controllers;

import com.projetobackend.dslist.dto.GameDTO;
import com.projetobackend.dslist.dto.GameListDTO;
import com.projetobackend.dslist.dto.GameMinDTO;
import com.projetobackend.dslist.services.GameListService;
import com.projetobackend.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
