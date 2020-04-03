package com.springboot.service.impl;

import com.springboot.dao.SuggestionsMapper;
import com.springboot.pojo.Suggestions;
import com.springboot.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SuggestionsMapper suggestionsMapper;

    @Override
    public List<Suggestions> listSuggestions(String key) {
        return suggestionsMapper.listSuggestions(key);
    }

}
