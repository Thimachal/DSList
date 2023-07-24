package com.thima.dslistThima.services;
import com.thima.dslistThima.dto.GameMinDTO;
import com.thima.dslistThima.entities.Game;
import com.thima.dslistThima.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //ou @Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result=gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
