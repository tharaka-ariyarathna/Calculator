package com.kelaniya.uni.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        //Make sure to validate arguments beforre using
        if (args.length == 0) {
            System.out.println("Please provide arguments before using");
            return;
        }
        ;

        //validating the user operation
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Input a valid argument");
            return;
        }
        ;

        List<String> numbersStr = Files.readAllLines(Paths.get("Numbers.txt"));

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        double result;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else {
            result = number1 * number2;
        }

        System.out.println(result);
    }
}
