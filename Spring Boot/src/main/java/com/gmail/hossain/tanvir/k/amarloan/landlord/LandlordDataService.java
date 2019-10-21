package com.gmail.hossain.tanvir.k.amarloan.landlord;

import com.gmail.hossain.tanvir.k.amarloan.professionalInfo.ProfessionalInfoDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandlordDataService {
    @Autowired
    private LandlordDataRepository dataRepository;
    public LandlordDataModel getOneByProfessionalInfoDataModelId(int professionId){
        return dataRepository
                .findByProfessionalInfoDataModelId(professionId);
    }

    public LandlordDataModel getOneById(int id){
        return dataRepository
                .findById(id)
                .get();
    }

    public String getTypeOfRentedPremises(int id){
        return dataRepository
                .findById(id)
                .get()
                .getTypeOfRentedPremises();
    }
    public int getNumberOfFloorsRented(int id){
        return dataRepository
                .findById(id)
                .get()
                .getNumberOfFloorsRented();
    }
    public String getAddressOfRentedPremises(int id){
        return dataRepository
                .findById(id)
                .get()
                .getAddressOfRentedPremises();
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

    public int addLandlord(LandlordDataModel dataModel, int professionId, int formId, int userId){
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Job",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public int updateLandlord(LandlordDataModel dataModel, int professionId, int userId, int formId) {
        if (dataRepository.findByProfessionalInfoDataModelId(professionId) != null) {
            int id = dataRepository.findByProfessionalInfoDataModelId(professionId).getId();
            dataRepository.deleteById(id);
        }
        dataModel.setProfessionalInfoDataModel(new ProfessionalInfoDataModel(professionId,"Job",formId, userId));
        return dataRepository.save(dataModel).getId();
    }

    public void deleteLandlord(LandlordDataModel dataModel){
        dataRepository.delete(dataModel);
    }

    public void deleteLandlordById(int id){
        dataRepository.deleteById(id);
    }

}
