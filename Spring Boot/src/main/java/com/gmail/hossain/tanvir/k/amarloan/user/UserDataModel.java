package com.gmail.hossain.tanvir.k.amarloan.user;

import javax.persistence.*;

@Entity
public class UserDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToMany(mappedBy="userDataModel", cascade = CascadeType.ALL)
    private int id;
    private String phone;

    public UserDataModel(){}
    public UserDataModel(int id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
