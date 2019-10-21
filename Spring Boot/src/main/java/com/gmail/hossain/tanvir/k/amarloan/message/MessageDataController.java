package com.gmail.hossain.tanvir.k.amarloan.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MessageDataController {
    @Autowired
    private MessageDataService dataService;
    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/message")
    public ArrayList<MessageDataModel> getAllByUserId(@PathVariable int userId){
        return dataService.getAllByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}/message/{id}")
    public MessageDataModel getOneById(@PathVariable int id){
        return dataService.getOneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/message")
    public int addOne(@RequestBody MessageDataModel dataModel, @PathVariable int userId){
        return dataService.addOne(dataModel,userId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "user/{userId}/message")
    public int updateOne(@RequestBody MessageDataModel dataModel, @PathVariable int userId){
        return dataService.updateOne(dataModel, userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/message")
    public void deleteOne(@RequestBody MessageDataModel dataModel){
        dataService.deleteOne(dataModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "user/{userId}/message/{id}")
    public void deleteOneById(@PathVariable int id){
        dataService.deleteOneById(id);
    }

}
