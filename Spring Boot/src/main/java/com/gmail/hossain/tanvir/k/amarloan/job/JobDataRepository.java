package com.gmail.hossain.tanvir.k.amarloan.job;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDataRepository extends CrudRepository<JobDataModel, Integer> {
    public JobDataModel findByProfessionalInfoDataModelId(int professionalInfoDataModel);
}
