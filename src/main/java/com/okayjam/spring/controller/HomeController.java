package com.okayjam.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
//@RequestMapping("/")
public class HomeController {

//  @RequestMapping(method = GET)
//  public String home(Model model) {
//    return "home";
//  }

  @Autowired
  JdbcOperations jdbcTemplate;


  @ResponseBody
  @RequestMapping(value = "/hello",method = GET)
  public String hello(Model model) {
    return "home111111111";
  }

}
