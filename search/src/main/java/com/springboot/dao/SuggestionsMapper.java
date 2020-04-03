package com.springboot.dao;

import com.springboot.pojo.Suggestions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuggestionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Suggestions record);

    int insertSelective(Suggestions record);

    Suggestions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Suggestions record);

    int updateByPrimaryKey(Suggestions record);

    List<Suggestions> listSuggestions(String key);
}