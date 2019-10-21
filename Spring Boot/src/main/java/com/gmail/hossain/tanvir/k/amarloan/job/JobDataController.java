package com.gmail.hossain.tanvir.k.amarloan.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobDataController {
    @Autowired
    private JobDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job")
    public JobDataModel getById(@PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.getOneByProfessionalInfoDataModelId(professionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job/{id}")
    public JobDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job")
    public int addOne(@RequestBody JobDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.addJob(dataModel, professionId, formId, userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job")
    public int updateOne(@RequestBody JobDataModel dataModel, @PathVariable int userId, @PathVariable int formId, @PathVariable int professionId){
        return dataService.updateJob(dataModel, professionId, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job")
    public void deleteOne(@RequestBody JobDataModel dataModel){
        dataService.deleteJob(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{professionId}/job/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteJobById(id);
    }
}
