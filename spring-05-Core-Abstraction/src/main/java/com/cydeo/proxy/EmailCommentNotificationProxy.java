package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
//@Primary ====>>>>instead it we can put qualifier annotaion in commentservice constructor
// with default bean name of class OR we can customize name like above
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
