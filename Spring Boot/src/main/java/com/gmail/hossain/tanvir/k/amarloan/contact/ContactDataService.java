package com.gmail.hossain.tanvir.k.amarloan.contact;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactDataService {
    @Autowired
    private ContactDataRepository dataRepository;

    public ContactDataModel getOneByFormId(int formId){
        return dataRepository
                .findByFormDataModelId(formId);
    }

    public ContactDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getPhone1(int id){
        return dataRepository
                .findById(id)
                .get()
                .getPhone1();
    }

    public String getPhone2(int id){
        return dataRepository
                .findById(id)
                .get()
                .getPhone2();
    }
    public String getEmail(int id){
        return dataRepository
                .findById(id)
                .get()
                .getEmail();
    }

    public String getPermanentAddress(int id){
        return dataRepository
                .findById(id)
                .get()
                .getPermanentAddress();
    }

    public String getPresentAddress(int id){
        return dataRepository
                .findById(id)
                .get()
                .getPresentAddress();
    }


    public int addContact(ContactDataModel dataModel, int userId, int formId){
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateContact(ContactDataModel dataModel, int userId, int formId) {
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteContact(ContactDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteContactById(int id){
        dataRepository.deleteById(id);
    }

}
