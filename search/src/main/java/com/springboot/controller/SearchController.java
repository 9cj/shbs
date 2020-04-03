package com.springboot.controller;

import com.springboot.pojo.Suggestions;
import com.springboot.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/search")
@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @ResponseBody
    @RequestMapping("/listSuggestions")
    public List<Suggestions> listSuggestions(String key) {
        return searchService.listSuggestions(key);
    }

    @RequestMapping("/SayHello")
    @ResponseBody
    public String hai() {
        return "hi";
    }

}
