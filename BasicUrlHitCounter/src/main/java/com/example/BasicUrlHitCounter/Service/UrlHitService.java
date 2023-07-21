package com.example.BasicUrlHitCounter.Service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    private static int urlCounter;


    public String hitUrl() {

        urlCounter++;
        return "The url is hit successfully..";
    }

    public String getUrlHitCounter() {
        return "The url is hit for "+urlCounter+" times..";
    }
}