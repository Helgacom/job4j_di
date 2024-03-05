package ru.job4j.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.aop.config.Config;
import ru.job4j.aop.model.Comment;
import ru.job4j.aop.service.ProcessComment;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProcessComment process = context.getBean("processComment", ProcessComment.class);
        process.publishingComment(new Comment("this is a comment", "Petr"));
        process.deleteComment(1);
        context.close();
    }
}
