package com.kelaniya.uni.V2;

public class main {
    public static void main(String[] args) {
        //Make sure to validate arguments beforre using
        if(args.length == 0){
            System.out.println("Please provide arguments before using");
            return;
        }
        //validating the user operation
        String operator = args[0] ;
        if(!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
            System.out.println("Input a valid argument");
            return;
        }

        System.out.println(args[0]);
    }
}
