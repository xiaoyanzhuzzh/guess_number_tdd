package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by zhangzhihui on 14-11-1.
 */
public class Guess {
    private CompareNumber compareNumber;
    private AnswerGenerator answerGenerator;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answerGenerator = answerGenerator;
        this.compareNumber = compareNumber;
    }

    public String guess(String input) {
        String answer = answerGenerator.generate();
        return compareNumber.compare(input, answer);
    }
}
