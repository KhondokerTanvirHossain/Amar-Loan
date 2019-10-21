package com.gmail.hossain.tanvir.k.amarloan.selfEmployed;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelfEmployedDataService {
    @Autowired
    private SelfEmployedDataRepository dataRepository;
    public SelfEmployedDataModel getOneByProfessionalInfoDataModelId(int professionId){
        return dataRepository
                .findByProfessionalInfoDataModelId(professionId);
    }

    public SelfEmployedDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getProfession(int id){
        return dataRepository
                .findById(id)
                .get()
                .getProfession();
    }
    public String getNatureOfOrganization(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNatureOfOrganization();
    }
    public int getNumberOfConsultancy(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNumberOfConsultancy();
    }

    public String getAddress(int id){
        return dataRepository
                .findById(id)
                .get()
                .getAddress();
    }
    public double getTotalExpense(int id){
        return dataRepository
                .findById(id)
                .get()
                .getTotalExpense();
    }
    public double getTotalIncome(int id){
        return dataRepository
                .findById(id)
                .get()
                .getTotalIncome();
    }

    public int addSelfEmployed(SelfEmployedDataModel dataModel, int professionId, int formId, int userId){
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Self Employed",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateSelfEmployed(SelfEmployedDataModel dataModel, int professionId, int userId, int formId) {
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Self Employed",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteSelfEmployed(SelfEmployedDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteSelfEmployedById(int id){
        dataRepository.deleteById(id);
    }
}
