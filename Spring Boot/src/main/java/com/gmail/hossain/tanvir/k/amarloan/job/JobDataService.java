package com.gmail.hossain.tanvir.k.amarloan.job;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobDataService {
    @Autowired
    private JobDataRepository dataRepository;

    public JobDataModel getOneByProfessionalInfoDataModelId(int professionId){
        return dataRepository
                .findByProfessionalInfoDataModelId(professionId);
    }

    public JobDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getNameOfTheEmployer(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNameOfTheEmployer();
    }
    public String getDesignation(int id){
        return dataRepository
                .findById(id)
                .get()
                .getDesignation();
    }
    public String getDepartment(int id){
        return dataRepository
                .findById(id)
                .get()
                .getDepartment();
    }
    public String getOfficeAddress(int id){
        return dataRepository
                .findById(id)
                .get()
                .getOfficeAddress();
    }
    public String getDateOfJoining(int id){
        return dataRepository
                .findById(id)
                .get()
                .getDateOfJoining();
    }
    public double getSalary(int id){
        return dataRepository
                .findById(id)
                .get()
                .getSalary();
    }
    public double getOtherIncome(int id){
        return dataRepository
                .findById(id)
                .get()
                .getOtherIncome();
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

    public int addJob(JobDataModel dataModel, int professionId, int formId, int userId){
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Job",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateJob(JobDataModel dataModel, int professionId, int userId, int formId) {
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Job",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteJob(JobDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteJobById(int id){
        dataRepository.deleteById(id);
    }

}
