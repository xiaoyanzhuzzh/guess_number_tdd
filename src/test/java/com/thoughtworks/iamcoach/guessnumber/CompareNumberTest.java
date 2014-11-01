package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {
    @Test
    public void length_should_be_4(){
        CompareNumber compareNumber = new CompareNumber();
        
        String input = "1234";
        String answer = "1234";

        assertThat(compareNumber.compare(input, answer).length()).isEqualTo(4);
    }
}
