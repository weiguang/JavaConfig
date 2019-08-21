package com.okayjam.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

  @RequestMapping("upload")
  public String upload(@RequestPart MultipartFile files, HttpServletRequest request) throws IOException {
    String path = request.getServletContext().getRealPath("");
    File file = new File(path + "/upload/" + files.getOriginalFilename());
    files.transferTo(file);
    System.out.println(file.getAbsolutePath());
    //response.sendRedirect("/1.html");
    return "redirect:/hello";
  }


  @RequestMapping("upload1")
  public String upload1(@RequestPart Part files, HttpServletRequest request) throws IOException {
    String path = request.getServletContext().getRealPath("");
    files.write(path + "/upload/" + files.getSubmittedFileName());
    System.out.println(path + "/upload/" + files.getSubmittedFileName());
    return "index";
  }

}
