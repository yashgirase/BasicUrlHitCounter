package com.example.BasicUrlHitCounter.Controller;


import com.example.BasicUrlHitCounter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService service;


    @GetMapping("hitUrl")
    public String hitUrl() {
        return service.hitUrl();
    }
}