package com.example.firstPro.repository;

import com.example.firstPro.domain.Sample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface SampleMapper {
    List<Sample> findAll();
    Sample findById(Long id);
    List<Sample> findAllByTitle(String title, RowBounds rowBounds);
}
