
package com.example.dinemaster.controller;

import com.example.dinemaster.model.*;

import com.example.dinemaster.service.ChefJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ChefController {
    @Autowired
    private ChefJpaService chefJpaService;

    @GetMapping("/restaurants/chefs")
    public ArrayList<Chef> getChefs() {
        return chefJpaService.getChefs();
    }

    @GetMapping("/restaurants/chefs/{chefId}")
    public Chef getChefById(@PathVariable("chefId") int id) {
        return chefJpaService.getChefById(id);
    }

    @PostMapping("/restaurants/chefs")
    public Chef addReview(@RequestBody Chef chef) {
        return chefJpaService.addChef(chef);
    }

    @PutMapping("/restaurants/chefs/{chefId}")
    public Chef updateChef(@PathVariable("chefId") int chefId, @RequestBody Chef chef) {
        return chefJpaService.updateChef(chefId, chef);
    }

    @DeleteMapping("/restaurants/chefs/{chefId}")
    public void deleteChef(@PathVariable("chefId") int chefId) {
        chefJpaService.deleteChef(chefId);
    }

    @GetMapping("/Chefs/{chefId}/restaurant")
    public Restaurant getReviewProduct(@PathVariable("chefId") int chefId) {
        return chefJpaService.getChefRestaurant(chefId);
    }
}