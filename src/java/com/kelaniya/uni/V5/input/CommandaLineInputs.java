package com.kelaniya.uni.V5.input;

public class CommandaLineInputs implements Inputs {

    private final String[] args;

    public CommandaLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperato() throws invalidInputException {
        //Make sure to validate arguments beforre using
        if (args.length == 0) {
            throw new invalidInputException("Please provide arguments before using") ;
        }

        //validating the user operation
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new invalidInputException("Input a valid argument") ;
        }

        return operator;
    }
}
