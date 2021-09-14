package com.kelaniya.uni.V4;

import com.kelaniya.uni.V4.Operation.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CommandaLineInputs inputs = new CommandaLineInputs(args);
        String operator = inputs.getOperato();

        FileReader fileReader = new FileReader();
        double[] numbers = fileReader.getNumbers();

        double number1 = numbers[0];
        double number2 = numbers[1];

        OperationFactory operationFactory = new OperationFactory() ;
        Operation operation = operationFactory.getOperator(operator) ;

        double result = operation.execute(numbers);

        UI ui = new UI() ;
        ui.showMessage("result is " + result);
    }
}
