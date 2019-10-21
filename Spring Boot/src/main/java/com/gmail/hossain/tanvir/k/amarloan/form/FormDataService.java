package com.gmail.hossain.tanvir.k.amarloan.form;

import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FormDataService {
    @Autowired
    FormDataRepository dataRepository;

    public ArrayList<FormDataModel> getAll(){
        ArrayList<FormDataModel> dataModels = new ArrayList<FormDataModel>();
        dataRepository
                .findAll()
                .forEach(dataModels::add);
        return dataModels;
    }

    public ArrayList<FormDataModel> getAllByUserId(int userId){
        ArrayList<FormDataModel> dataModels = new ArrayList<FormDataModel>();
        dataRepository
                .findByUserDataModelId(userId)
                .forEach(dataModels::add);
        return dataModels;
    }
    public FormDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public int addOne(FormDataModel dataModel, int userId){
        dataModel.setUserDataModel(new UserDataModel(userId,""));
        return dataRepository.save(dataModel).getId();
    }

    public int updateOne(FormDataModel dataModel, int userId){
        dataModel.setUserDataModel(new UserDataModel(userId,""));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteOne(FormDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteOneById(int id){
        dataRepository.deleteById(id);
    }
}
