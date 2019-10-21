package com.gmail.hossain.tanvir.k.amarloan.landlord;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;

import javax.persistence.*;

@Entity
public class LandlordDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String typeOfRentedPremises;
    private int numberOfFloorsRented;
    private String addressOfRentedPremises;
    private double totalIncome;
    private double totalExpense;
    @OneToOne
    private ProfessionalInfoDataModel professionalInfoDataModel;

    public LandlordDataModel() {}

    public LandlordDataModel(int id, String typeOfRentedPremises, int numberOfFloorsRented, String addressOfRentedPremises, double totalIncome, double totalExpense, int professionalInfoDataModelId) {
        Id = id;
        this.typeOfRentedPremises = typeOfRentedPremises;
        this.numberOfFloorsRented = numberOfFloorsRented;
        this.addressOfRentedPremises = addressOfRentedPremises;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.professionalInfoDataModel = new ProfessionalInfoDataModel(professionalInfoDataModelId, "", -1, -1);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTypeOfRentedPremises() {
        return typeOfRentedPremises;
    }

    public void setTypeOfRentedPremises(String typeOfRentedPremises) {
        this.typeOfRentedPremises = typeOfRentedPremises;
    }

    public int getNumberOfFloorsRented() {
        return numberOfFloorsRented;
    }

    public void setNumberOfFloorsRented(int numberOfFloorsRented) {
        this.numberOfFloorsRented = numberOfFloorsRented;
    }

    public String getAddressOfRentedPremises() {
        return addressOfRentedPremises;
    }

    public void setAddressOfRentedPremises(String addressOfRentedPremises) {
        this.addressOfRentedPremises = addressOfRentedPremises;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public ProfessionalInfoDataModel getProfessionalInfoDataModel() {
        return professionalInfoDataModel;
    }

    public void setProfessionalInfoDataModel(ProfessionalInfoDataModel professionalInfoDataModel) {
        this.professionalInfoDataModel = professionalInfoDataModel;
    }
}

