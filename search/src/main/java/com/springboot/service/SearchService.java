package com.springboot.service;

import com.springboot.pojo.Suggestions;

import java.util.List;

public interface SearchService {
     List<Suggestions> listSuggestions(String key);
}
