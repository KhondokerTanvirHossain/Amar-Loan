package com.gmail.hossain.tanvir.k.amarloan.form;

import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;

import javax.persistence.*;

@Entity
public class FormDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
//    @JoinColumn(name ="userId")
    private UserDataModel userDataModel;

    public FormDataModel(){}
    public FormDataModel(int id, int userDataModelId) {
        this.id = id;
        this.userDataModel = new UserDataModel(userDataModelId,"");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDataModel getUserDataModel() {
        return userDataModel;
    }

    public void setUserDataModel(UserDataModel userDataModel) {
        this.userDataModel = userDataModel;
    }
}
