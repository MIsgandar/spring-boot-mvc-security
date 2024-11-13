package com.gg.springbootmvc.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

   @GetMapping("/showMyLoginForm")
   public String myLoginPage() {

     //  return "plain-login";
       return "fancy-login";
   }
   @GetMapping("/access-denied")
   public String showAccessDenied() {

        //  return "plain-login";
        return "access-denied";
    }

}
