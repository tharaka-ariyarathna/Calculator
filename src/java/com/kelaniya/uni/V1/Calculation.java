package com.kelaniya.uni.V1;

public class Calculation {
    public void add(int num1 , int num2){
        int num = num1 + num2 ;
        System.out.println(num);
    }
    public void subtract(int num1 , int num2){
        int num = num1 - num2 ;
        System.out.println(num);
    }
    public  void multiply(int num1 , int num2){
        int num = num1*num2 ;
        System.out.println(num);
    }
    public void calculator(int input , int num1 , int num2){
        if(input == 1){
            add(num1 , num2) ;
        }else if(input == 2){
            subtract(num1 , num2);
        }else if(input == 3){
            multiply(num1 , num2);
        }else{
            System.out.println("Wrong input");
        }
    }
}
