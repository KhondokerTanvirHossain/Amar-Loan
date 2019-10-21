package com.gmail.hossain.tanvir.k.amarloan.personalInfo;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PersonalInfoDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private String fatherName;
    private String motherName;
    private String birthOfDate;
    private String gender;
    @OneToOne
    private FormDataModel formDataModel;

    public PersonalInfoDataModel(){}

    public PersonalInfoDataModel(int id, String fullName, String fatherName, String motherName, String birthOfDate, String gender, int formDataModelId, int userDataModelId) {
        this.id = id;
        this.fullName = fullName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.birthOfDate = birthOfDate;
        this.gender = gender;
        this.formDataModel = new FormDataModel(formDataModelId, userDataModelId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FormDataModel getFormDataModel() {
        return formDataModel;
    }

    public void setFormDataModel(FormDataModel formDataModel) {
        this.formDataModel = formDataModel;
    }
}
