package com.thoughtworks.iamcoach.guessnumber;

public class Guess {
    private CompareNumber compareNumber;
    private String answer;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answer = answerGenerator.generate();
        this.compareNumber = compareNumber;
    }

    public String guess(String input) {
        return compareNumber.compare(input, answer);
    }
}
