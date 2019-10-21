package com.gmail.hossain.tanvir.k.amarloan.professionalInfo;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;

import javax.persistence.*;

@Entity
public class ProfessionalInfoDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String profession;
    @OneToOne
    private FormDataModel formDataModel;

    ProfessionalInfoDataModel(){}

    public ProfessionalInfoDataModel(int id, String profession, int formId, int userId) {
        this.id = id;
        this.profession = profession;
        this.formDataModel = new FormDataModel(formId, userId);
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

    public FormDataModel getFormDataModel() {
        return formDataModel;
    }

    public void setFormDataModel(FormDataModel formDataModel) {
        this.formDataModel = formDataModel;
    }
}
