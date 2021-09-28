package com.kelaniya.uni.V5.Operation;

public class DivOperation implements Operation {
    public double execute(double[] numbers) throws InvalidOperationException {
        if(numbers[1] == 0){
            throw new InvalidOperationException("Do not devide by zero") ;
        }
        return numbers[0] / numbers[1] ;
    }
}
