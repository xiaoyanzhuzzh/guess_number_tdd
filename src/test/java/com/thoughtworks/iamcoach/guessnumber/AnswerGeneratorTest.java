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


}
