package com.valhallagamingstore.valhallags_products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valhallagamingstore.valhallags_products.models.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
