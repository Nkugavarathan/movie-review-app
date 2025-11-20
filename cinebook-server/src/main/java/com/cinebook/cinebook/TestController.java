package com.cinebook.cinebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   @GetMapping("/")
    public String sample(){
       return "backend is working";
   }
}
