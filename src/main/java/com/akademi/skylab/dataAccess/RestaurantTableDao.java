package com.akademi.skylab.dataAccess;

import com.akademi.skylab.entities.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RestaurantTableDao extends JpaRepository<RestaurantTable, Integer> {

}
