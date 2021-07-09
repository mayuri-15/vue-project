package com.vuespringboot.project.service;

import com.vuespringboot.project.controller.MessageController;
import com.vuespringboot.project.entity.PeopleInfo;
import com.vuespringboot.project.repository.PeopleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleInfoService {

    @Autowired
    private MessageController messageController;

    @Autowired
    private PeopleInfoRepository peopleInfoRepository;

    public List<PeopleInfo> getPeopleInfo(){
        List<PeopleInfo> peopleInfos = peopleInfoRepository.findAll();
        return peopleInfos;
    }

    public void savePeopleInfo(PeopleInfo peopleInfo){
        peopleInfoRepository.save(peopleInfo);
    }
}
