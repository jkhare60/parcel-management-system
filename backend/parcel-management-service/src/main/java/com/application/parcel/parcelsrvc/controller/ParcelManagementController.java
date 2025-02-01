package com.application.parcel.parcelsrvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.parcel.parcelsrvc.dto.UserDetails;
import com.application.parcel.parcelsrvc.util.Constants;


@Controller
@RequestMapping(Constants.BASE)
public class ParcelManagementController {
    
    @RequestMapping(path=Constants.PATH, method=RequestMethod.GET)
    @ResponseBody
    public UserDetails requestMethodName() {
        UserDetails user=new UserDetails();
        user.setName("Jai");
        return user;
    }
}
