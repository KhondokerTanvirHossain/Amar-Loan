package com.gmail.hossain.tanvir.k.amarloan.form;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface FormDataRepository extends CrudRepository<FormDataModel, Integer> {
    public ArrayList<FormDataModel> findByUserDataModelId(int userDataModelId);

}
