package com.gmail.hossain.tanvir.k.amarloan.message;

import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MessageDataService {
    @Autowired
    private MessageDataRepository dataRepository;
    public ArrayList<MessageDataModel> getAll(){
        ArrayList<MessageDataModel> dataModels = new ArrayList<MessageDataModel>();
        dataRepository
                .findAll()
                .forEach(dataModels::add);
        return dataModels;
    }

    public ArrayList<MessageDataModel> getAllByUserId(int userId){
        ArrayList<MessageDataModel> dataModels = new ArrayList<MessageDataModel>();
        dataRepository
                .findByUserDataModelId(userId)
                .forEach(dataModels::add);
        return dataModels;
    }
    public MessageDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public int addOne(MessageDataModel dataModel, int userId){
        dataModel.setUserDataModel(new UserDataModel(userId,""));
        return dataRepository.save(dataModel).getId();
    }

    public int updateOne(MessageDataModel dataModel, int userId){
        dataModel.setUserDataModel(new UserDataModel(userId,""));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteOne(MessageDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteOneById(int id){
        dataRepository.deleteById(id);
    }

}
