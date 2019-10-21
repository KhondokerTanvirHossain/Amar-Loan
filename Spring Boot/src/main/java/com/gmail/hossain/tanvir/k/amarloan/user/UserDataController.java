package com.gmail.hossain.tanvir.k.amarloan.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserDataController {
    @Autowired
    UserDataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public ArrayList<UserDataModel> getAll(){
        return dataService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public UserDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/phone/{id}")
    public String getPhone(@PathVariable int id){
        return dataService.getPhone(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/Id/{phone}")
    public int getPhone(@PathVariable String phone){
        return dataService.getIdByPhone(phone);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public int addOne(@RequestBody UserDataModel dataModel){
        return dataService.addOne(dataModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public int updateOne(@RequestBody UserDataModel dataModel){
        return dataService.updateOne(dataModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    public void updatePhoneById(@PathVariable int id, @RequestBody String phone){
        dataService.updatePhoneById(id, phone);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user")
    public void deleteOne(@RequestBody UserDataModel dataModel){
        dataService.deleteOne(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteOneById(@PathVariable int id){
        dataService.deleteById(id);
    }

}
