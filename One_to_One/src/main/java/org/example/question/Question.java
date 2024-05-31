package org.example.question;

import org.example.answer.Answer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
public class Question {

    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;

    @OneToOne
    private Answer answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question(int questionId, String question, Answer answer) {
        super();
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
        super();
    }
}