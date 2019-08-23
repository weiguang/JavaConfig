package com.okayjam.spring.controller;

import com.okayjam.spring.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
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
public class DataController {

  @Autowired
  DataService dataService;

  @ResponseBody
  @RequestMapping(value = "/data",method = GET)
  public String hello(Model model) {
    dataService.list();
    return "home111111111";
  }

}
