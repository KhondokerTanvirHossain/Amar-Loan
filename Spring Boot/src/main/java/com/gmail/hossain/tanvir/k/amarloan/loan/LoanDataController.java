package com.gmail.hossain.tanvir.k.amarloan.loan;

import com.gmail.hossain.tanvir.k.amarloan.form.FormDataModel;
import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LoanDataController {
    @Autowired
    private LoanDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/loan")
    public LoanDataModel getByFormId(@PathVariable int userId, @PathVariable int formId){
        return dataService.getOneByFormId(formId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{formId}/loan/{id}")
    public LoanDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form/{formId}/loan")
    public int addOne(@RequestBody LoanDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.addLoan(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form/{formId}/loan")
    public int updateOne(@RequestBody LoanDataModel dataModel, @PathVariable int userId, @PathVariable int formId){
        return dataService.updateLoan(dataModel, userId, formId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/loan")
    public void deleteOne(@RequestBody LoanDataModel dataModel){
        dataService.deleteLoan(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{formId}/loan/{id}")
    public void deleteOneById(@PathVariable int userId, @PathVariable int formId, @PathVariable int id){
        dataService.deleteLoanById(id);
    }
}
