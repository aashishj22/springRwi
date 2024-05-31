package org.example;

import org.example.answer.Answer;
import org.example.question.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //create ques
        Question q1 = new Question();
        q1.setQuestion("what is Java");
        q1.setQuestionId(11);
        //create ans
        Answer answer1 = new Answer();
        answer1.setAnswer("java is programming language");
        answer1.setAnswerId(21);
        answer1.setQuestion(q1);
        q1.setAnswer(answer1);

        //create ques
        Question q2 = new Question();
        q2.setQuestion("what is Hibernate");
        q2.setQuestionId(12);
        //create ans
        Answer answer2 = new Answer();
        answer2.setAnswer("Hibernate is an ORM tool");
        answer2.setAnswerId(22);
        answer2.setQuestion(q2);
        q2.setAnswer(answer2);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(q1);
        s.save(q2);
        s.save(answer1);
        s.save(answer2);

        tx.commit();
        factory.close();
        s.close();

        System.out.println("data saved");
    }
}
