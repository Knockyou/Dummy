package com.example.firstPro.repository;

import com.example.firstPro.domain.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// 인터페이스만 선언해도 spring-jpa가 구현체를 자동으로 만들어준다
public interface ChildRepository extends JpaRepository<Child, Long>, ChildRepositoryCustom {
    // JQPL 사용
    @Query("SELECT c FROM Child c left join fetch c.parent")
    List<Child> fetchAll();
}
