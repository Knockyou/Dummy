package com.example.firstPro.repository;

import com.example.firstPro.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

// 인터페이스만 선언해도 spring-jpa가 구현체를 자동으로 만들어준다
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Page<Article> findAllByTitle(String type, Pageable pageable);
}
