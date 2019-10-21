package com.gmail.hossain.tanvir.k.amarloan.selfEmployed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SelfEmployedDataController {
    @Autowired
    private SelfEmployedDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed")
    public SelfEmployedDataModel getById(@PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.getOneByProfessionalInfoDataModelId(professionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed/{id}")
    public SelfEmployedDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed")
    public int addOne(@RequestBody SelfEmployedDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.addSelfEmployed(dataModel, professionId, formId, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed")
    public int updateOne(@RequestBody SelfEmployedDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.updateSelfEmployed(dataModel, professionId, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed")
    public void deleteOne(@RequestBody SelfEmployedDataModel dataModel){
        dataService.deleteSelfEmployed(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/selfEmployed/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteSelfEmployedById(id);
    }
}
