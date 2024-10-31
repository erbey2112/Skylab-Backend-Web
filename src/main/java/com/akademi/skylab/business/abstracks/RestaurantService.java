package com.akademi.skylab.business.abstracks;

import com.akademi.skylab.entities.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant  addRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(int id);

    List<Restaurant> getAllRestaurants();

    void deleteRestaurantById(int id);

    Restaurant getRestaurantByName






}
