package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void can_get_correct_output(){
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1256", "1234")).thenReturn("2A0B");

        Guess guess = new Guess(answerGenerator,compareNumber);
        assertThat(guess.guess("1256")).isEqualTo("2A0B");
    }
}
