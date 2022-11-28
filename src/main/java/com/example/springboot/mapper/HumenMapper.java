package com.example.springboot.mappers;

import com.example.springboot.entity.Humen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HumenMapper
{
    List<Humen> findAll();
}
