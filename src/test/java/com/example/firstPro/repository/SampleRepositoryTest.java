package com.example.firstPro.repository;

import com.example.firstPro.domain.Parent;
import com.example.firstPro.domain.Sample;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleRepositoryTest {
    @Autowired
    SampleRepository sampleRepository;
//    @Autowired
//    SampleMapper sampleMapper;

//    @Test
//    void findAll(){
//        List<Sample> list = sampleRepository.findAll();
//        for(Sample s : list){
//            System.out.println(s.getTitle());
//        }
//    }
//
//    @Test
//    void findAllByTitle(){
//        Map<String, Object> filter = new HashMap<>();
//        filter.put("title","first Data");
//
//        PageRequest pageable = PageRequest.of(0,10);
//        Page<Sample> page = sampleRepository.findAll(SampleSpecs.search(filter), pageable);
//
//        for(Sample s : page){
//            System.out.println(s.getTitle());
//        }
//    }
//
//    @Test
//    void findAllByTitleLike()
//    {
//        List<Sample> list = sampleRepository.findAllByTitleLike("Data");
//
//        for(Sample s : list){
//            System.out.println(s.getTitle());
//        }
//    }
//
//    @Test
//    void findById()
//    {
//        Sample sample = sampleMapper.findById(1L);
//        System.out.println(sample.getTitle());
//        assertEquals(1, sample.getId());
//    }
//
//    @Test
//    void findAllByTitle1()
//    {
//        RowBounds rowBounds = new RowBounds(0, 10);
//        List<Sample> samples = sampleMapper.findAllByTitle("first Data", rowBounds);
//        for(Sample sample : samples){
//            System.out.println(sample.getTitle());
//        }
//    }

    @Test
    void findByTitleLikes(){
        List<Sample> page = sampleRepository.findByAllTitleLike("%t1%");

        for(Sample s : page){
            System.out.println(s.getTitle());
        }

        for (int i = 0; i < 10; i++){
            Parent parent = new Parent();
        }
    }




}
