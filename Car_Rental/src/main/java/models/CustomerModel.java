/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author SONY VIAO
 */
public class CustomerModel {
    private final int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String rentedOn;
    private String rentedForDays;
    private String vehicleRented;
    private int rentAmount;
    
    public CustomerModel(int id){
        this.id=id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getRentedOn() {
        return rentedOn;
    }
    
    public void setRentedOn(String rentedOn) {
        this.rentedOn = rentedOn;
    }
    
    public String getRentedForDays() {
        return rentedForDays;
    }
    
    public void setRentedForDays(String rentedForDays) {
        this.rentedForDays = rentedForDays;
    }
    
    public String getVehicleRented() {
        return vehicleRented;
    }
    
    public void setVehicleRented(String vehicleRented) {
        this.vehicleRented = vehicleRented;
    }
    
    public int getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }
    
    
}
