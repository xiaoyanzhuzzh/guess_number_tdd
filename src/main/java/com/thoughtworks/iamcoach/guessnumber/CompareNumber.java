package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by zhangzhihui on 14-11-1.
 */
public class CompareNumber {
    public String compare(String input, String answer) {
        int numberA = 0;
        int numberB = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == answer.charAt(i)){
                numberA += 1;
            }else{
                for(int j = 0; j < answer.length(); j++){
                    if(input.charAt(i) == answer.charAt(j)){
                        numberB += 1;
                    }
                }
            }
        }

        return numberA + "A" + numberB + "B";
    }
}
