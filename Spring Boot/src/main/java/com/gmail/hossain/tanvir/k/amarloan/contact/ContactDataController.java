package com.gmail.hossain.tanvir.k.amarloan.contact;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactDataController {
    @Autowired
    private ContactDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/contact")
    public ContactDataModel getByFormId(@PathVariable int userId, @PathVariable int formId){
        return dataService.getOneByFormId(formId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/contact/{id}")
    public ContactDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/contact")
    public int addOne(@RequestBody ContactDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.addContact(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/contact")
    public int updateOne(@RequestBody ContactDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.updateContact(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/contact")
    public void deleteOne(@RequestBody ContactDataModel dataModel){
        dataService.deleteContact(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/contact/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteContactById(id);
    }
}
