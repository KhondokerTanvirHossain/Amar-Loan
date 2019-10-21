package com.gmail.hossain.tanvir.k.amarloan.selfEmployed;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelfEmployedDataRepository extends CrudRepository<SelfEmployedDataModel, Integer> {
    public SelfEmployedDataModel findByProfessionalInfoDataModelId(int professionalInfoDataModel);
}
