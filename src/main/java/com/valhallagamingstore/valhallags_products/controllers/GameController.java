package com.valhallagamingstore.valhallags_products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.valhallagamingstore.valhallags_products.models.Game;
import com.valhallagamingstore.valhallags_products.services.GameService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/valhallags/products")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("")
    public ResponseEntity<?> getGame() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(gameService.allGames());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor, intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneGame(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(gameService.findGameById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor, intente mas tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> saveGame(@RequestBody Game game) {
        try {
            gameService.saveGame(game);
            return ResponseEntity.status(HttpStatus.CREATED).body("Guardado con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor, intente mas tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateGame(@PathVariable Integer id, @RequestBody Game game) {
        try {
            gameService.updateGame(id, game);
            return ResponseEntity.status(HttpStatus.OK).body("Actualizado con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor, intente mas tarde.\"}");
        }
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> deleteGame(@PathVariable Integer id, @RequestBody Game game) {
        try {
            gameService.deleteGame(id, game);
            return ResponseEntity.status(HttpStatus.OK).body("Usuario eliminado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor, intente mas tarde.\"}");
        }
    }
}
