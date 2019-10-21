package com.gmail.hossain.tanvir.k.amarloan.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDataService {
    @Autowired
    private UserDataRepository dataRepository;

    public ArrayList<UserDataModel> getAll(){
        ArrayList<UserDataModel> dataModels = new ArrayList<UserDataModel>();
        dataRepository
                .findAll()
                .forEach(dataModels::add);
        return dataModels;
    }

    public UserDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getPhone(int id){
        return dataRepository
                .findById(id)
                .get()
                .getPhone();
    }

    public int getIdByPhone(String phone){
        return dataRepository
                .findByPhone(phone)
                .getId();
    }

    public int addOne(UserDataModel dataModel){
        return dataRepository.save(dataModel).getId();

    }

    public int updateOne(UserDataModel dataModel){
        return dataRepository.save(dataModel).getId();
    }


    public void updatePhoneById(int id, String phone){
        UserDataModel dataModel = dataRepository.findById(id).get();
        dataModel.setPhone(phone);
        dataRepository.save(dataModel);
    }

    public void deleteOne(UserDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteById(int id){
        dataRepository.deleteById(id);
    }
}
