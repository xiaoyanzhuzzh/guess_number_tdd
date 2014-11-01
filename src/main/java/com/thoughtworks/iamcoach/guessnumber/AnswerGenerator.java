package com.thoughtworks.iamcoach.guessnumber;

public class AnswerGenerator {
    public String generate() {
        String answers = "";
        for(int i = 0; i < 4; i++){
            int answer = (int)(10 * Math.random());
            answers += answer;
        }

        return answers;
    }
}
