package com.example.firstPro.repository;

import com.example.firstPro.domain.Child;

import java.util.List;

// 인터페이스만 선언해도 spring-jpa가 구현체를 자동으로 만들어준다
public interface ChildRepositoryCustom{
    // QueryDSL 사용
    List<Child> selectAll();
}
