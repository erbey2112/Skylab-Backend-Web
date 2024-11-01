package com.akademi.skylab.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tables")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name = "capacity")
    private int capacity;

    @Column(name= "is Reserved")
    private boolean isReserved;

    @Column(name = "reserved by")
    private String reservedBy;

    @ManyToOne
    @JoinColumn(name = "restaurant id")
    private Restaurant restaurant;

    public RestaurantTable() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }



    public String getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(String reservedBy) {
        this.reservedBy = reservedBy;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public RestaurantTable(int id, int capacity, boolean isReserved, String reservedBy, Restaurant restaurant) {
        this.id = id;
        this.capacity = capacity;
        this.isReserved = isReserved;
        this.reservedBy = reservedBy;
        this.restaurant = restaurant;
    }

}
