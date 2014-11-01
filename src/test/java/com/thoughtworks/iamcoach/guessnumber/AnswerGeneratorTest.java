package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator;

    @Before
    public void before() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

        answerGenerator = new AnswerGenerator(random);
    }

    @Test
    public void answer_length_should_be_four(){
        assertThat(answerGenerator.generate().length()).isEqualTo(4);
    }

    @Test
    public void answer_should_be_random(){

        assertThat(answerGenerator.generate()).isEqualTo("1234");
    }

    @Test
    public void answer_should_be_number(){
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

    @Test
    public void answer_should_not_be_repeated(){

        String answer = answerGenerator.generate();
        boolean isNotRepeat = true;
        for(int i=0; i<answer.length(); i++){
            for(int j = i+1; j<answer.length(); j++){
                if(answer.charAt(i) == answer.charAt(j)){
                    isNotRepeat = false;
                    break;
                }
            }
        }
        assertThat(isNotRepeat).isTrue();
    }
}
