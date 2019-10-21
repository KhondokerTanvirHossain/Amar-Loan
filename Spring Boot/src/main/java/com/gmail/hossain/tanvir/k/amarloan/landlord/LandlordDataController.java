package com.gmail.hossain.tanvir.k.amarloan.landlord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LandlordDataController {
    @Autowired
    private LandlordDataService dataService;
    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord")
    public LandlordDataModel getById(@PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.getOneByProfessionalInfoDataModelId(professionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord/{id}")
    public LandlordDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord")
    public int addOne(@RequestBody LandlordDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.addLandlord(dataModel, professionId, formId, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord")
    public int updateOne(@RequestBody LandlordDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.updateLandlord(dataModel, professionId, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord")
    public void deleteOne(@RequestBody LandlordDataModel dataModel){
        dataService.deleteLandlord(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/landlord/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteLandlordById(id);
    }
}