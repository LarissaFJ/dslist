package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

@Service
public class GameService {
   @Autowired
    private GameRepository gameRepository;

   @Transactional
   public GameDTO findById(Long id){
       Game result = gameRepository.findById(id).get();
       GameDTO dto = new GameDTO(result);
       return dto;
   }
    @Transactional
    public List<GameMinDTO> findAll(){
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
    }
}
