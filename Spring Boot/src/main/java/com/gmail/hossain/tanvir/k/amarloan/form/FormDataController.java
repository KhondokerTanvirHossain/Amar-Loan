package com.gmail.hossain.tanvir.k.amarloan.form;

import com.gmail.hossain.tanvir.k.amarloan.user.UserDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FormDataController {

    @Autowired
    private FormDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form")
    public ArrayList<FormDataModel> getAllByUserId(@PathVariable int userId){
        return dataService.getAllByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/form/{id}")
    public FormDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/form")
    public int addOne(@RequestBody FormDataModel dataModel, @PathVariable int userId){
        return dataService.addOne(dataModel,userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/form")
    public int updateOne(@RequestBody FormDataModel dataModel, @PathVariable int userId){
        return dataService.updateOne(dataModel, userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form")
    public void deleteOne(@RequestBody FormDataModel dataModel){
        dataService.deleteOne(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/form/{id}")
    public void deleteOneById(@PathVariable int id){
        dataService.deleteOneById(id);
    }
}
