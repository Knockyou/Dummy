package com.example.firstPro.repository;

import com.example.firstPro.domain.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

// 인터페이스만 선언해도 spring-jpa가 구현체를 자동으로 만들어준다
public interface SampleRepository extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {
    Optional<Sample> findOneByTitle(String title);
    Page<Sample> findByTitle(String type, Pageable pageable);
    List<Sample> findAllByTitleLike(String title);
    List<Sample> findAllByTitle(String type);
}
