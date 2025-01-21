package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import com.devsuperior.dslist.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
   @Autowired
    private GameListRepository gameListRepository;

    @Transactional
    public List<GameListDTO> findAll(){
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map( x -> new GameListDTO(x)).toList();


    }
}
