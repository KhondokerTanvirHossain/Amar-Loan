package com.gmail.hossain.tanvir.k.amarloan.business;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;

import javax.persistence.*;

@Entity
public class BusinessDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String nameOfTheOrganization;
    private String designation;
    private String equityShare;
    private String mainProduct;
    private String natureOfBusiness;
    private String officeAddress;
    private String legalStatusOfBusiness;
    private String totalBusinessExperience;
    private String dateOfInception;
    private String officePremisesStatus;
    private double totalIncome;
    private double totalExpense;
    @OneToOne
    private ProfessionalInfoDataModel professionalInfoDataModel;

    public BusinessDataModel(){}
    public BusinessDataModel(int id, String nameOfTheOrganization, String designation, String equityShare, String mainProduct, String natureOfBusiness, String officeAddress, String legalStatusOfBusiness, String totalBusinessExperience, String dateOfInception, String officePremisesStatus, double totalIncome, double totalExpense, int professionalInfoDataModelId) {
        Id = id;
        this.nameOfTheOrganization = nameOfTheOrganization;
        this.designation = designation;
        this.equityShare = equityShare;
        this.mainProduct = mainProduct;
        this.natureOfBusiness = natureOfBusiness;
        this.officeAddress = officeAddress;
        this.legalStatusOfBusiness = legalStatusOfBusiness;
        this.totalBusinessExperience = totalBusinessExperience;
        this.dateOfInception = dateOfInception;
        this.officePremisesStatus = officePremisesStatus;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.professionalInfoDataModel = new ProfessionalInfoDataModel(professionalInfoDataModelId, "Business", -1, -1);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameOfTheOrganization() {
        return nameOfTheOrganization;
    }

    public void setNameOfTheOrganization(String nameOfTheOrganization) {
        this.nameOfTheOrganization = nameOfTheOrganization;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEquityShare() {
        return equityShare;
    }

    public void setEquityShare(String equityShare) {
        this.equityShare = equityShare;
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getLegalStatusOfBusiness() {
        return legalStatusOfBusiness;
    }

    public void setLegalStatusOfBusiness(String legalStatusOfBusiness) {
        this.legalStatusOfBusiness = legalStatusOfBusiness;
    }

    public String getTotalBusinessExperience() {
        return totalBusinessExperience;
    }

    public void setTotalBusinessExperience(String totalBusinessExperience) {
        this.totalBusinessExperience = totalBusinessExperience;
    }

    public String getDateOfInception() {
        return dateOfInception;
    }

    public void setDateOfInception(String dateOfInception) {
        this.dateOfInception = dateOfInception;
    }

    public String getOfficePremisesStatus() {
        return officePremisesStatus;
    }

    public void setOfficePremisesStatus(String officePremisesStatus) {
        this.officePremisesStatus = officePremisesStatus;
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
