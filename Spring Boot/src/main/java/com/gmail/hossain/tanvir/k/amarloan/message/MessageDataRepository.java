package com.gmail.hossain.tanvir.k.amarloan.message;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MessageDataRepository extends CrudRepository<MessageDataModel, Integer> {
    public ArrayList<MessageDataModel> findByUserDataModelId(int userDataModelId);
}
