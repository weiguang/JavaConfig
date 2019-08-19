package com.okayjam.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
//@RequestMapping("/")
public class HomeController {

//  @RequestMapping(method = GET)
//  public String home(Model model) {
//    return "home";
//  }



  @ResponseBody
  @RequestMapping(value = "/hello",method = GET)
  public String hello(Model model) {
    return "home111111111";
  }

}
