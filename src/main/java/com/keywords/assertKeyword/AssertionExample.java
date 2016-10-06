package com.keywords.assertKeyword;

/**
 * Created by gpunyakoti on 10/6/2016.
 */
public class AssertionExample {
    public static void main(String[] args) {
        // get a number in the first argument
        int number = 15;
        try {
            assert number > 10 :number; // stops if number == 10
        }catch (AssertionError e){
            System.out.println(e.getMessage());
        }
        System.out.println("number "+number+" Pass");
        int i=5;
        if (i % 3 == 0) {
        } else if (i % 3 == 1) {
        } else {
            assert i % 3 == 2:i ;
            System.out.println(i);
        }

    }
}
