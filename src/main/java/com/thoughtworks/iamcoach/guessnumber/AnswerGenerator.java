package com.thoughtworks.iamcoach.guessnumber;

import java.util.Random;

public class AnswerGenerator {
    private  Random random;

    AnswerGenerator(Random random){
        this.random = random;
    }

    public String generate() {
        String answers = "";

        while (answers.length() < 4){
            int answer = random.nextInt(10);

            if(answers.contains(answer +"")){
                answer = random.nextInt(10);
            }

            answers += answer;
        }
        return answers;
    }
}
