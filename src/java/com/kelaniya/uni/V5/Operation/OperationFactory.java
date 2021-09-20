package com.kelaniya.uni.V5.Operation;

public class OperationFactory {
    public Operation getOperator(String operator) {
        Operation operation = null;
        if (operator.equals("add")) {
            operation = new AddOperation();
        } else if (operator.equals("sub")) {
            operation = new SubOperation();
        } else if (operator.equals("mul")) {
            operation = new MulOperation();
        }

        return operation;
    }
}
