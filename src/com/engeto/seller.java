package com.engeto;

import java.time.LocalDate;

public class seller {
    private String nameAndSurname;
    private LocalDate birthDate;
    private int numberOfConcludedContrats;
    private double quantity;
    private String address;
    private String licensePlateNumber;
    private double consumption;
    private String iPAddress;

    public seller(String nameAndSurname, LocalDate birthDate,
                  int numberOfConcludedContrats, double quantity,
                  String address, String licensePlateNumber,
                  double consumption, String iPAddress) {
        this.nameAndSurname = nameAndSurname;
        this.birthDate = birthDate;
        this.numberOfConcludedContrats = numberOfConcludedContrats;
        this.quantity = quantity;
        this.address = address;
        this.licensePlateNumber = licensePlateNumber;
        this.consumption = consumption;
        this.iPAddress = iPAddress;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate() {
        this.birthDate = birthDate;
    }

    public int getNumberOfConcludedContrats() {
        return numberOfConcludedContrats;
    }

    public void setNumberOfConcludedContrats(int numberOfConcludedContrats) {
        this.numberOfConcludedContrats = numberOfConcludedContrats;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getiPAddress() {
        return iPAddress;
    }

    public void setiPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }
}
