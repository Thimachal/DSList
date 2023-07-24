package com.thima.dslistThima.controllers;

import com.thima.dslistThima.dto.GameMinDTO;
import com.thima.dslistThima.entities.Game;
import com.thima.dslistThima.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/games")
public class GameControllers {
    @Autowired
    private GameService gameservice;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result=gameservice.findAll();
        return result;
    }

}
