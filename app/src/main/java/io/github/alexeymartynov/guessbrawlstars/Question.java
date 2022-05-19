package io.github.alexeymartynov.guessbrawlstars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

    private String question, rightAnswer;
    private List<String> answers = new ArrayList<>();

    public Question(String question, String rightAnswer, String... answers) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answers = Arrays.asList(answers);
    }
}
