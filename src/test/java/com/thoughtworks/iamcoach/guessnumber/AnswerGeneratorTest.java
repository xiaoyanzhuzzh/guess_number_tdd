package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class AnswerGeneratorTest {
    @Test
    public void answer_length_should_be_four(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        assertThat(answerGenerator.generate().length()).isEqualTo(4);
    }


}
