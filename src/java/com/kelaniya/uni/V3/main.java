package com.kelaniya.uni.V3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        CommandaLineInputs inputs = new CommandaLineInputs(args);
        String operator = inputs.getOperato();

        FileReader fileReader = new FileReader();
        double[] numbers = fileReader.getNumbers();

        double number1 = numbers[0];
        double number2 = numbers[1];

        double result;

        if (operator.equals("add")) {
            AddOperation addOperation = new AddOperation();
            result = addOperation.execute(numbers);
        } else if (operator.equals("sub")) {
            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);
        } else {
            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);
        }

        System.out.println(result);

    }
}
