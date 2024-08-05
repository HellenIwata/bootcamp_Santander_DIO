package com.me.mgtmRestaurant.service.impl;


import com.me.mgtmRestaurant.domain.model.Restaurant;
import com.me.mgtmRestaurant.domain.repository.RestaurantRepository;
import com.me.mgtmRestaurant.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant finById(Long id) {
        return restaurantRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Restaurant create(Restaurant restaurantToCreate) {
        if(restaurantRepository.existsByInformationName(restaurantToCreate.getInformation().getName())){
            throw new IllegalArgumentException("Restaurant already exists");
        }
        return restaurantRepository.save(restaurantToCreate);
    }
}
