package com.akademi.skylab.webAPIController;

import com.akademi.skylab.business.abstracks.RestaurantService;
import com.akademi.skylab.entities.Restaurant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/addRestaurants")
    public ResponseEntity<Restaurant> addRestaurant (@RequestBody Restaurant restaurant) {
        var result = restaurantService.addRestaurant(restaurant);

        if (result != null) {
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.status(201).body(result);

    }

    //getmapping evde hallet

    @DeleteMapping ("/deleteRestaurantById/{id}")
    public ResponseEntity<Restaurant> deleteRestaurantById (@PathVariable int id) {}

}
