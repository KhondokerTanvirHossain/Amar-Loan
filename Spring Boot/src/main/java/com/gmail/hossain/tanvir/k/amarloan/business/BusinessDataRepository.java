package com.gmail.hossain.tanvir.k.amarloan.business;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessDataRepository extends CrudRepository<BusinessDataModel, Integer> {
    public BusinessDataModel findByProfessionalInfoDataModelId(int professionalInfoDataModel);
}
