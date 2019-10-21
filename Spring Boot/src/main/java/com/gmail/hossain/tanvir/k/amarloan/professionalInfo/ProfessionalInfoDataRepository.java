package com.gmail.hossain.tanvir.k.amarloan.professionalInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalInfoDataRepository extends CrudRepository<ProfessionalInfoDataModel, Integer> {
    public ProfessionalInfoDataModel findByFormDataModelId(int formDataModelId);
}
