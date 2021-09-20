package com.kelaniya.uni.V5.input;

public class CommandaLineInputs implements Inputs {

    private final String[] args;

    public CommandaLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperato() {
        //Make sure to validate arguments beforre using
        if (args.length == 0) {
            System.out.println("Please provide arguments before using");
            return "";
        }
        ;

        //validating the user operation
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Input a valid argument");
            return "";
        }
        ;

        return operator;
    }
}
