package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    private AnswerGenerator answerGenerator;
    private CompareNumber compareNumber;

    @Before
    public void before(){
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);
        
        answerGenerator = new AnswerGenerator(random);
        compareNumber = new CompareNumber();
    }

    @Test
    public void should_be_right(){
        Guess guess = new Guess(answerGenerator, compareNumber);
        String input = "1234";
        assertThat(guess.guess(input)).isEqualTo("4A0B");
    }

}
