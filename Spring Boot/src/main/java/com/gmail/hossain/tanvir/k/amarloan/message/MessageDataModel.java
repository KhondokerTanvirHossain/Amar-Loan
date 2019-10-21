package com.gmail.hossain.tanvir.k.amarloan.message;

import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;

import javax.persistence.*;

@Entity
public class MessageDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String message;
    @ManyToOne
    private UserDataModel userDataModel;

    public MessageDataModel() {}
    public MessageDataModel(int id, String message, int userDataModelId) {
        Id = id;
        this.message = message;
        this.userDataModel = new UserDataModel(userDataModelId, "");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserDataModel getUserDataModel() {
        return userDataModel;
    }

    public void setUserDataModel(UserDataModel userDataModel) {
        this.userDataModel = userDataModel;
    }
}
