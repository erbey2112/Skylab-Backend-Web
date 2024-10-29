package com.akademi.skylab.dataAccess;

import com.akademi.skylab.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantDao  extends JpaRepository<Restaurant, Integer> {
}
