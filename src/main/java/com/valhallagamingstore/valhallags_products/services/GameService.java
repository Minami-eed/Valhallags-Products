package com.valhallagamingstore.valhallags_products.services;

import java.util.List;

import com.valhallagamingstore.valhallags_products.models.Game;

public interface GameService {

    // READ
    public List<Game> allGames();

    // CREATE
    public void saveGame(Game game);

    // UPDATE
    public void updateGame(Integer id, Game game);

    // DELETE
    public void deleteGame(Integer id, Game game);

    // FIND BY ID
    public Game findGameById(Integer id);
}
