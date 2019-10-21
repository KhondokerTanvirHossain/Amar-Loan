package com.gmail.hossain.tanvir.k.amarloan.professionalInfo;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalInfoDataService {
    @Autowired
    private ProfessionalInfoDataRepository dataRepository;

    public ProfessionalInfoDataModel getOneByFormId(int formId){
        return dataRepository
                .findByFormDataModelId(formId);
    }

    public ProfessionalInfoDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public int addProfessionalInfo(ProfessionalInfoDataModel dataModel, int userId, int formId){
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateProfessionalInfo(ProfessionalInfoDataModel dataModel, int userId, int formId) {
        if (dataRepository.findByFormDataModelId(formId) != null) {
            int id = dataRepository.findByFormDataModelId(formId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setFormDataModel(new FormDataModel(formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteProfessionalInfo(ProfessionalInfoDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteProfessionalInfoById(int id){
        dataRepository.deleteById(id);
    }


}
