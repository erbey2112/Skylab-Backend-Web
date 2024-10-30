package com.akademi.skylab.entities;

public class RestaurantTable {
    private int id;
    private String name;
    private String capacity;
    private String reservedBy;
    private String restaurant;

    public int RestaurantTable(int id, String name, String capacity, String reservedBy, String restaurant) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.reservedBy = reservedBy;
        this.restaurant = restaurant;
        public int getid () {
            return id;
        }
        public void setid ( int id){
            this.id = id;
        }
        public String getname () {
            return name;
        }
        public void setname (String name){
            this.name = name;
        }
        public String capacity () {
            return capacity;
        }
        public void setcapacity (String capacity){
            this.capacity = capacity;
        }
        public String getreservedBy () {
            return reservedBy;
        }
        public void setreservedBy (String reservedBy){
            this.reservedBy = reservedBy;
        }
        public String getrestaurant () {
            return restaurant;
        }
        public void setrestaurant (String restaurant){
            this.restaurant = restaurant;
        }
    }
}
