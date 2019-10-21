package com.gmail.hossain.tanvir.k.amarloan.loan;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LoanDataRepository extends CrudRepository<LoanDataModel, Integer> {
    public LoanDataModel findByFormDataModelId(int formDataModelId);
}
