/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author SONY VIAO
 */
public class VehicleModel {
    final private int id;
    private String model;
    private String number;
    private int maxSeats;
    private int rentPerDay;
    private boolean isRented;

    public VehicleModel(int id){
        this.id=id;
    }
    
    public int getID() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void getModel(String model) {
        this.model = model;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void getNumber(String number) {
        this.number = number;
    }
    
    public int getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
    
    public boolean isRented() {
        return isRented;
    }

    public void setRentPerDay(boolean isRented) {
        this.isRented = isRented;
    }
    
}
