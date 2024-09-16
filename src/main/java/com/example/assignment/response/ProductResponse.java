package com.example.assignment.response;

public class ProductResponse {
    private double cost;
    private String name;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public ProductResponse(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

//    public int getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
