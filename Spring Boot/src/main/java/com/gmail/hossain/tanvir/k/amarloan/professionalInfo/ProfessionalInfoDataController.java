package com.gmail.hossain.tanvir.k.amarloan.professionalInfo;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfessionalInfoDataController {
    @Autowired
    private ProfessionalInfoDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo")
    public ProfessionalInfoDataModel getByFormId(@PathVariable int userId, @PathVariable int formId){
        return dataService.getOneByFormId(formId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/professionalInfo/{id}")
    public ProfessionalInfoDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/professionalInfo")
    public int addOne(@RequestBody ProfessionalInfoDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.addProfessionalInfo(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/professionalInfo")
    public int updateOne(@RequestBody ProfessionalInfoDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.updateProfessionalInfo(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo")
    public void deleteOne(@RequestBody ProfessionalInfoDataModel dataModel){
        dataService.deleteProfessionalInfo(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/professionalInfo/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteProfessionalInfoById(id);
    }
}
