package com.gmail.hossain.tanvir.k.amarloan.loan;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;

import javax.persistence.*;

@Entity
public class LoanDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    private String tenure;
    private String amount;
    @OneToOne
    private FormDataModel formDataModel;

    public LoanDataModel(){}

    public LoanDataModel(int id, String type, String tenure, String amount, int formDataModelId, int userDataModelId) {
        this.id = id;
        this.type = type;
        this.tenure = tenure;
        this.amount = amount;
        this.formDataModel = new FormDataModel(formDataModelId,userDataModelId);
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public FormDataModel getFormDataModel() {
        return formDataModel;
    }

    public void setFormDataModel(FormDataModel formDataModel) {
        this.formDataModel = formDataModel;
    }
}
