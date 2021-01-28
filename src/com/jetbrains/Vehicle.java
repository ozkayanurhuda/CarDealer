package com.jetbrains;

public class Vehicle {
    double price ;
    String name ;
    String model;
    int year;
    int km;

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name =name ;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public int getYear() {
        return year;
    }

    public void setYear (int year) {
        this.year=year;
    }

    public int getKm() {
        return km ;
    }

    public void setKm (int km) {
        this.km =km;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price=price ;
    }

}
