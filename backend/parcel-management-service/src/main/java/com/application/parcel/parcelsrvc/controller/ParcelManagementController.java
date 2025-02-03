package com.application.parcel.parcelsrvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.parcel.parcelsrvc.dto.UserInfo;
import com.application.parcel.parcelsrvc.entity.UserDetails;
import com.application.parcel.parcelsrvc.repo.UserRepository;
import com.application.parcel.parcelsrvc.util.Constants;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping(Constants.BASE)
@Slf4j
public class ParcelManagementController {

    @Autowired
    UserRepository repo;
    
    @RequestMapping(path=Constants.PATH1, method=RequestMethod.GET)
    @ResponseBody
    public UserInfo getUserDetails() {
        UserInfo user=new UserInfo();
        user.setName("Jai");
        return user;
    }

    @RequestMapping(path=Constants.PATH2, method=RequestMethod.POST)
    @ResponseBody
    public UserDetails sendUserDetails(@RequestBody UserDetails input) {
        log.info("request in controller: {}",input.toString());
        return repo.save(input);
    }
}
