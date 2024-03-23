package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    //  private DBCommentRepository dbCommentRepository;
    // this is thightly coupled instead use interface as reference type

    // put final: it is good practice, you can forget constructor but after final keyword you cannot
    // forget you have to initialize with constructor
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    // for loosely coupled tomorrow maybe need push notification

// @AUTOWIRED ====>>>>  DEPENDENCY INJECTION AUTOMATICALLY IS DONE BY CONSTRUCTOR
    public CommentService(CommentRepository commentRepository,@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){

        // save in the DB
       commentRepository.storeComment(comment);
        //SEND EMAIL
        commentNotificationProxy.sendComment(comment);



    }


}
