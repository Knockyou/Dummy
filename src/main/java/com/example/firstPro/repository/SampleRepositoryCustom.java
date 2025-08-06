package com.example.firstPro.repository;

import com.example.firstPro.domain.Sample;

import java.util.List;

public interface SampleRepositoryCustom {
    // 3) Query DSL
    List<Sample> findAllByDynamicCondition(String title);
    Long countByTitleContaining(String title);

}
