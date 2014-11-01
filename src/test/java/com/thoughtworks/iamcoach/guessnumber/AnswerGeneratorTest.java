package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class AnswerGeneratorTest {
    @Test
    public void answer_length_should_be_four(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        assertThat(answerGenerator.generate().length()).isEqualTo(4);
    }

    @Test
    public void answer_should_be_random(){
        AnswerGenerator answerGenerator = new AnswerGenerator();

        String answerOne = answerGenerator.generate();
        String answerTwo = answerGenerator.generate();

        assertThat(answerOne).isNotEqualTo(answerTwo);
    }

    @Test
    public void answer_should_be_number(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generate();

        boolean isNumber = true;
        for(int i=0; i<answer.length(); i++){
            if(answer.charAt(i) >57 || answer.charAt(i) < 48){
                isNumber = false;
                break;
            }
        }

        assertThat(isNumber).isTrue();
    }
}
