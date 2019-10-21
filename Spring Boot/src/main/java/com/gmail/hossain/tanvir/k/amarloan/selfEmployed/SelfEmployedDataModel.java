package com.gmail.hossain.tanvir.k.amarloan.selfEmployed;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;

import javax.persistence.*;

@Entity
public class SelfEmployedDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String profession;
    private String natureOfOrganization;
    private String address;
    private int numberOfConsultancy;
    private double totalIncome;
    private double totalExpense;
    @OneToOne
    private ProfessionalInfoDataModel professionalInfoDataModel;

    public SelfEmployedDataModel() {}

    public SelfEmployedDataModel(int id, String profession, String natureOfOrganization, String address, int numberOfConsultancy, double totalIncome, double totalExpense, int professionalInfoDataModelId) {
        this.id = id;
        this.profession = profession;
        this.natureOfOrganization = natureOfOrganization;
        this.address = address;
        this.numberOfConsultancy = numberOfConsultancy;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.professionalInfoDataModel = new ProfessionalInfoDataModel(professionalInfoDataModelId, "", -1, -1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNatureOfOrganization() {
        return natureOfOrganization;
    }

    public void setNatureOfOrganization(String natureOfOrganization) {
        this.natureOfOrganization = natureOfOrganization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfConsultancy() {
        return numberOfConsultancy;
    }

    public void setNumberOfConsultancy(int numberOfConsultancy) {
        this.numberOfConsultancy = numberOfConsultancy;
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
