package com.gmail.hossain.tanvir.k.amarloan.business;

import com.gmail.hossain.tanvir.k.amarloan.business.BusinessDataModel;
import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessDataService {
    @Autowired
    private BusinessDataRepository dataRepository;
    public BusinessDataModel getOneByProfessionalInfoDataModelId(int professionId){
        return dataRepository
                .findByProfessionalInfoDataModelId(professionId);
    }

    public BusinessDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getNameOfTheOrganization(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNameOfTheOrganization();
    }
    public String getDesignation(int id){
        return dataRepository
                .findById(id)
                .get()
                .getDesignation();
    }
    public String getEquityShare(int id){
        return dataRepository
                .findById(id)
                .get()
                .getEquityShare();
    }

    public String getMainProduct(int id){
        return dataRepository
                .findById(id)
                .get()
                .getMainProduct();
    }
    public String getNatureOfBusiness(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNatureOfBusiness();
    }
    public String getLegalStatusOfBusiness(int id){
        return dataRepository
                .findById(id)
                .get()
                .getLegalStatusOfBusiness();
    }
    public String getOfficeAddress(int id){
        return dataRepository
                .findById(id)
                .get()
                .getOfficeAddress();
    }
    public String getDateOfInception(int id){
        return dataRepository
                .findById(id)
                .get()
                .getDateOfInception();
    }

    public String getOfficePremisesStatus(int id){
        return dataRepository
                .findById(id)
                .get()
                .getOfficePremisesStatus();
    }

    public String getTotalBusinessExperience(int id){
        return dataRepository
                .findById(id)
                .get()
                .getTotalBusinessExperience();
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

    public int addJob(BusinessDataModel dataModel, int professionId, int formId, int userId){
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Business",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateJob(BusinessDataModel dataModel, int professionId, int userId, int formId) {
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Business",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteJob(BusinessDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteJobById(int id){
        dataRepository.deleteById(id);
    }

}
