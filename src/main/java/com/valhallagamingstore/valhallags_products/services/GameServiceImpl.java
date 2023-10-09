package com.valhallagamingstore.valhallags_products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valhallagamingstore.valhallags_products.models.Game;
import com.valhallagamingstore.valhallags_products.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    @Transactional
    public List<Game> allGames() {
        return gameRepository.findAll();
    }

    @Override
    @Transactional
    public void saveGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    @Transactional
    public void updateGame(Integer id, Game game) {
        Game updateId = gameRepository.findById(id).get();
        gameRepository.save(updateId);
    }

    @Override
    @Transactional
    public void deleteGame(Integer id, Game game) {
        Game deleteId = gameRepository.findById(id).get();
        gameRepository.save(deleteId);
    }

    @Override
    @Transactional
    public Game findGameById(Integer id) {
        Game gameSearch = gameRepository.findById(id).orElse(null);
        return gameSearch;
    }

}
