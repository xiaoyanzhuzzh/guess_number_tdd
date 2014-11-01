package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    //集成测试
    @Test
    public void should_be_right(){
          Random random = mock(Random.class);
          when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

        Guess guess = new Guess(new AnswerGenerator(random), new CompareNumber());
        String input = "1234";
        assertThat(guess.guess(input)).isEqualTo("4A0B");
    }
    //单元测试
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
