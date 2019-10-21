package com.gmail.hossain.tanvir.k.amarloan.contact;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;

import javax.persistence.*;

@Entity
public class ContactDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String phone1;
    private String phone2;
    private String email;
    private String presentAddress;
    private String permanentAddress;
    @OneToOne
    private FormDataModel  formDataModel;

    public ContactDataModel(){}

    public ContactDataModel(int id, String phone1, String phone2, String email, String presentAddress, String permanentAddress, int formDataModelId, int userDataModelId) {
        Id = id;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.formDataModel = new FormDataModel(formDataModelId, userDataModelId);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public FormDataModel getFormDataModel() {
        return formDataModel;
    }

    public void setFormDataModel(FormDataModel formDataModel) {
        this.formDataModel = formDataModel;
    }
}
