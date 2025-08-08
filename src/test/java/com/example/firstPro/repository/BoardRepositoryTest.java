package com.example.firstPro.repository;

import com.example.firstPro.domain.Article;
import com.example.firstPro.domain.Board;
import com.example.firstPro.domain.Comment;
import com.example.firstPro.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    CommentRepository commentRepository;

    public void dummyDataSet(){
        //List<Board> boards = new ArrayList<>();
        //게시판 생성
        /*
        for(int i = 0; i < 2; i++) {
            Board board = new Board();
            board.setGroupId(i);
            board.setName("게시판"+i);
            boards.add(board);
            boardRepository.save(board);
        }

        // 유서 생성
        List<User> users = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            User user = new User();
            user.setUserId("user"+i);
            user.setUserPwd("pass***"+i);
            users.add(user);
            user.setMemberType(i % 2 == 0 ? 1 : 0);
            //userRepository
        }
        */

        // 게시글 생성
        User user = userRepository.findById(1L).get();
        Board board = boardRepository.findById(1L).get();
        //List<Article> articles = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Article article = new Article();
            article.setBoard(board);
            article.setTitle("게시물"+i);
            article.setUser(user);
            article.setContents("라르글앙릉를ㅇ"+i);
            articleRepository.save(article);
        }

        // 댓글 생성
        /*
        List<Comment> comments = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i < 10; i++){
            Comment comment = new Comment();
            comment.setArticle(articles.get(temp));
            comment.setAuthor(users.get(temp).getUserId());
            comment.setContent("댓글댓글댓글댓글"+i);
            if (temp > 3)
                temp = 0;
            else
                ++temp;
        }
        */
    }

    @Test
    void selectAll(){
        dummyDataSet();
    }

    @Test
    void pageNation()
    {
        PageRequest pageable = PageRequest.of(0,2);
        Page<Article> articles = articleRepository.findAll(pageable);

        for(Article a : articles){
            System.out.println(a.getTitle());
        }
    }




}
