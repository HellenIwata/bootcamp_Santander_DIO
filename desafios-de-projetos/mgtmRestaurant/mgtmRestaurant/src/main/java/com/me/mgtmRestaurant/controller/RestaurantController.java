package com.me.mgtmRestaurant.controller;

import com.me.mgtmRestaurant.domain.model.Restaurant;
import com.me.mgtmRestaurant.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // Get all restaurants
    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> findById(@PathVariable Long id){
        var localizeRestaurant = restaurantService.finById(id);
        return ResponseEntity.ok(localizeRestaurant);
    }

    @PostMapping
    public ResponseEntity<Restaurant> create(@RequestBody Restaurant restaurantToCreate){
        var restaurantCreated = restaurantService.create(restaurantToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/restaurants/{id}").buildAndExpand(restaurantCreated.getId()).toUri();
        return ResponseEntity.created(location).body(restaurantCreated);
    }
}
