package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.Operation.Operation;
import com.kelaniya.uni.V5.Operation.OperationFactory;
import com.kelaniya.uni.V5.ui.UI;
import com.kelaniya.uni.V5.ui.UIcmdLineUI;
import com.kelaniya.uni.V5.input.CommandaLineInputs;
import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.repository.FileNumberRepository;
import com.kelaniya.uni.V5.repository.NumberRepository;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        Inputs inputs = new CommandaLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory() ;
        UI ui = new UIcmdLineUI() ;
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui) ;
        app.execute();

    }
}
