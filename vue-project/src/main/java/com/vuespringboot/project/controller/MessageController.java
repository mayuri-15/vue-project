package com.vuespringboot.project.controller;

import com.vuespringboot.project.entity.PeopleInfo;
import com.vuespringboot.project.service.PeopleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private PeopleInfoService peopleInfoService;

    @CrossOrigin
    @GetMapping("/hello")
    public String hello(){
        String value= "Full Stack Development with Spring Boot & VueJs!";
        return value;
    }

    @CrossOrigin
    @PostMapping("/sendInfo")
    public void sendPeopleInformation(@RequestBody  PeopleInfo peopleInfo){
        peopleInfoService.savePeopleInfo(peopleInfo);
    }

    @CrossOrigin
    @GetMapping("/peopleInfo")
    public List<PeopleInfo> getPeopleInformation(){
        List<PeopleInfo> peopleInfos = peopleInfoService.getPeopleInfo();
        return peopleInfos;
    }

}
