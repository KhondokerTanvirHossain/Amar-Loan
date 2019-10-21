package com.gmail.hossain.tanvir.k.amarloan.personalInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoDataRepository extends CrudRepository<PersonalInfoDataModel, Integer> {
    public PersonalInfoDataModel findByFormDataModelId(int formDataModelId);
}
