package com.me.mgtmRestaurant.domain.repository;

import com.me.mgtmRestaurant.domain.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    boolean existsByInformationName(String restaurantName);
}
