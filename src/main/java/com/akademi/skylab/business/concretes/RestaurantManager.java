package com.akademi.skylab.business.concretes;

import com.akademi.skylab.business.abstracks.RestaurantService;
import com.akademi.skylab.dataAccess.RestaurantDao;
import com.akademi.skylab.entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantManager implements RestaurantService {

    private final RestaurantDao restaurantDao;

    public RestaurantManager(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {

        if (restaurant.getName().length() < 3) {
            return null;
        }

        return restaurantDao.save(restaurant);

    }

    @Override
    public Restaurant getRestaurantById(int id) {
        Optional<Restaurant> restaurant = restaurantDao.findById(id);

        if (!restaurant.isPresent()) {
            return null;
        }

        return restaurant.get();

    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        var restaurants = restaurantDao.findAll();

        if (restaurants.isEmpty()) {
            return null;
        }

        return restaurants;
    }

    @Override
    public void deleteRestaurantById(int id) {

    }

}
