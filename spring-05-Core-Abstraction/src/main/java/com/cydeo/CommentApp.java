package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment(); // here for test example now in real app no need
        comment.setAuthor("Johson");
        comment.setText("Your spring work is nice keep going");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);




    }
}
