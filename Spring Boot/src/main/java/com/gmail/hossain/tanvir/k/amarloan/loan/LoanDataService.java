package com.gmail.hossain.tanvir.k.amarloan.loan;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoanDataService {
    @Autowired
    private LoanDataRepository dataRepository;

    public LoanDataModel getOneByFormId(int formId){
        return dataRepository
                .findByFormDataModelId(formId);
    }

    public LoanDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getLoanType(int id){
        return dataRepository
                .findById(id)
                .get()
                .getType();
    }
    public String getLoanTenure(int id){
        return dataRepository
                .findById(id)
                .get()
                .getTenure();
    }
    public String getLoanAmount(int id){
        return dataRepository
                .findById(id)
                .get()
                .getAmount();
    }
    public int addLoan(LoanDataModel dataModel, int userId, int formId){
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateLoan(LoanDataModel dataModel, int userId, int formId) {
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteLoan(LoanDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteLoanById(int id){
        dataRepository.deleteById(id);
    }

}
