package ru.fedotov.SpringWebMVC.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class MainController {


    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("2001", HttpStatus.OK);
    }

}
