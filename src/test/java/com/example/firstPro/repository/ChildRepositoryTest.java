package com.example.firstPro.repository;

import com.example.firstPro.domain.Child;
import com.example.firstPro.domain.Parent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
//@Transactional
public class ChildRepositoryTest {
    @Autowired
    ChildRepository childRepository;

    @Autowired
    ParentRepository parentRepository;

    public void beforeEach(){
        for(Long i = 0L; i < 10; i++){
            Parent parent = new Parent();
            parent.setName("parent" + i);
            parentRepository.save(parent);

            Child child = new Child();
            child.setName("child" + i);
            child.setParent(parent);
            childRepository.save(child);

        }
    }

    @Test
    void findAll(){
        //List<Child> children = childRepository.findAll();
        List<Child> children = childRepository.fetchAll();

        for(Child c : children){
            System.out.println(c.getName());
        }
    }


    @Test
    void selectAll(){
        List<Child> children = childRepository.selectAll();
        for(Child c : children){
            c.getName();
        }
    }
}
