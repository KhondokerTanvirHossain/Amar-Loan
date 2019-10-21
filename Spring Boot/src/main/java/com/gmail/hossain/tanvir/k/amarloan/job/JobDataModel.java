package com.gmail.hossain.tanvir.k.amarloan.job;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;

import javax.persistence.*;

@Entity
public class JobDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameOfTheEmployer;
    private String designation;
    private String department;
    private String officeAddress;
    private String dateOfJoining;
    private double salary;
    private double otherIncome;
    private double totalIncome;
    private double totalExpense;

    @OneToOne
    private ProfessionalInfoDataModel professionalInfoDataModel;

    public JobDataModel(){}

    public JobDataModel(int id, String nameOfTheEmployer, String designation, String department, String officeAddress, String dateOfJoining, double salary, double otherIncome, double totalIncome, double totalExpense, int professionalInfoDataModelId) {
        this.id = id;
        this.nameOfTheEmployer = nameOfTheEmployer;
        this.designation = designation;
        this.department = department;
        this.officeAddress = officeAddress;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.otherIncome = otherIncome;
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

    public String getNameOfTheEmployer() {
        return nameOfTheEmployer;
    }

    public void setNameOfTheEmployer(String nameOfTheEmployer) {
        this.nameOfTheEmployer = nameOfTheEmployer;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(double otherIncome) {
        this.otherIncome = otherIncome;
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
