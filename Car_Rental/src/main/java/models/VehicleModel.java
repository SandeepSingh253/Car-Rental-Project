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
    private int isRented;
    
    public VehicleModel(){
        id=-1;
    }
    
    public VehicleModel(int id){
        this.id=id;
    }
    
    public int getID() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public int getMaxSeats() {
        return maxSeats;
    }
    
    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }
    
    public int getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
    
    public int isRented() {
        return isRented;
    }

    public void setIsRented(int isRented) {
        this.isRented = isRented;
    }
    
}
