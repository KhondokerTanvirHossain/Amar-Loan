package com.gmail.hossain.tanvir.k.amarloan.personalInfo;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonalInfoDataService {
    @Autowired
    private PersonalInfoDataRepository dataRepository;

    public PersonalInfoDataModel getOneByFormId(int formId){
        return dataRepository
                .findByFormDataModelId(formId);
    }

    public PersonalInfoDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getFullName(int id){
        return dataRepository
                .findById(id)
                .get()
                .getFullName();
    }
    public String getFatherName(int id){
        return dataRepository
                .findById(id)
                .get()
                .getFatherName();
    }

    public String getMotherName(int id){
        return dataRepository
                .findById(id)
                .get()
                .getMotherName();
    }

    public String getDateOfBirth(int id){
        return dataRepository
                .findById(id)
                .get()
                .getBirthOfDate();
    }
    public String getGender(int id){
        return dataRepository
                .findById(id)
                .get()
                .getGender();
    }
    public int addPersonalInfo(PersonalInfoDataModel dataModel, int userId, int formId){
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updatePersonalInfo(PersonalInfoDataModel dataModel, int userId, int formId) {
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deletePersonalInfo(PersonalInfoDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deletePersonalInfoById(int id){
        dataRepository.deleteById(id);
    }


}
