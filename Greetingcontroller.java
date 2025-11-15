package com.outh.sampleoth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetingcontroller {
    @GetMapping("/hello")
     public  String sayhello(){
         return " Hello you are welcome";
     }

}
