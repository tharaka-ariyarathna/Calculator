package com.kelaniya.uni.V1;

import java.util.Scanner;

public class userInput {

    public int input(){
        System.out.println("Select one from following\n" +
                            "1.Add\n" +
                            "2.Subtract\n" +
                            "3.Multiply");

        Scanner scanner = new Scanner(System.in) ;
        int number = scanner.nextInt() ;
        return number ;
    }


}
