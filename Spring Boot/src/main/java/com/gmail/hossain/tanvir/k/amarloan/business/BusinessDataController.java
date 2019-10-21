package com.gmail.hossain.tanvir.k.amarloan.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BusinessDataController {
    @Autowired
    private BusinessDataService dataService;
    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business")
    public BusinessDataModel getById(@PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.getOneByProfessionalInfoDataModelId(professionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business/{id}")
    public BusinessDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business")
    public int addOne(@RequestBody BusinessDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.addJob(dataModel, professionId, formId, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business")
    public int updateOne(@RequestBody BusinessDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.updateJob(dataModel, professionId, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business")
    public void deleteOne(@RequestBody BusinessDataModel dataModel){
        dataService.deleteJob(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/business/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteJobById(id);
    }
}
