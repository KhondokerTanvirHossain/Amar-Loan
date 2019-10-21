package com.gmail.hossain.tanvir.k.amarloan.personalInfo;


import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import com.gmail.hossain.tanvir.k.amarloan.personalInfo.PersonalInfoDataModel;
import com.gmail.hossain.tanvir.k.amarloan.personalInfo.PersonalInfoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonalInfoDataController {
    @Autowired
    private PersonalInfoDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/personalInfo")
    public PersonalInfoDataModel getByFormId(@PathVariable int userId, @PathVariable int formId){
        return dataService.getOneByFormId(formId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/personalInfo/{id}")
    public PersonalInfoDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/personalInfo")
    public int addOne(@RequestBody PersonalInfoDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.addPersonalInfo(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/personalInfo")
    public int updateOne(@RequestBody PersonalInfoDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.updatePersonalInfo(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/personalInfo")
    public void deleteOne(@RequestBody PersonalInfoDataModel dataModel){
        dataService.deletePersonalInfo(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/personalInfo/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deletePersonalInfoById(id);
    }
}
