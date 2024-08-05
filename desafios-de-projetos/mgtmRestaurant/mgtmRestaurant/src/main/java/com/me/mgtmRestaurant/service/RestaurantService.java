package com.me.mgtmRestaurant.service;

import com.me.mgtmRestaurant.domain.model.Restaurant;

public interface RestaurantService {
    Restaurant finById(Long id);

    Restaurant create(Restaurant restaurantToCreate);
}
