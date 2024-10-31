package com.akademi.skylab.dataAccess;

import com.akademi.skylab.entities.Restaurant;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantDao  extends JpaRepository<Restaurant, Integer> {

    Optional<Restaurant> findRestaurantByName(String name);

}
