package com.gmail.hossain.tanvir.k.amarloan.landlord;

import org.springframework.data.repository.CrudRepository;

public interface LandlordDataRepository extends CrudRepository<LandlordDataModel, Integer> {
    public LandlordDataModel findByProfessionalInfoDataModelId(int professionalInfoDataModel);
}
