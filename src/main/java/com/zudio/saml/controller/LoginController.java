package com.zudio.saml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apollo")
public class LoginController {
    @GetMapping("/login")
    public String getApp(){
        return "Apollo application home page throught saml login";
    }
}
