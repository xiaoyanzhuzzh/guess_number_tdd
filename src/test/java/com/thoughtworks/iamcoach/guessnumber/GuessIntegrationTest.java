package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntegrationTest {
    @Test
    public void should_be_right(){
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

        Guess guess = new Guess(new AnswerGenerator(random), new CompareNumber());
        String input = "1234";
        assertThat(guess.guess(input)).isEqualTo("4A0B");
    }
}
