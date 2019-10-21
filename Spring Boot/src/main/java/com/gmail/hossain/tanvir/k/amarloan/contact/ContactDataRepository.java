package com.gmail.hossain.tanvir.k.amarloan.contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDataRepository extends CrudRepository<ContactDataModel, Integer> {
    public ContactDataModel findByFormDataModelId(int formDataModelId);
}
