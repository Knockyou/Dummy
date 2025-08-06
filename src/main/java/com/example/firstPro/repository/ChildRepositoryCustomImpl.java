package com.example.firstPro.repository;

import com.example.firstPro.domain.Child;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

import static com.example.firstPro.domain.QChild.child;
import static com.example.firstPro.domain.QParent.parent;

@Repository
public class ChildRepositoryCustomImpl implements ChildRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public ChildRepositoryCustomImpl(JPAQueryFactory queryFactory){
        this.queryFactory = queryFactory;
    }

    @Override
    public List<Child> selectAll(){
        return queryFactory
                .selectFrom(child)
                .leftJoin(child.parent, parent)
                .fetchJoin()
                .fetch();
    }
}