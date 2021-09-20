package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.Operation.Operation;
import com.kelaniya.uni.V5.Operation.OperationFactory;
import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.ui.UI;

import java.io.IOException;

public class CalculatorApp {
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {

        String operator = inputs.getOperato();
        double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getOperator(operator) ;
        double result = operation.execute(numbers);
        ui.showMessage("result is " + result);

    }
}
