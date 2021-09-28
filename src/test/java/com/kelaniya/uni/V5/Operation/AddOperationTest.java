package com.kelaniya.uni.V5.Operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

public class AddOperationTest {
       // test cases
       // 1.positive number+positive number => 2+2=>4
       // 2.zero + zero => 0+0=>0
       // 3.negative number + negative number => -8 + -7 +> -15
       // 4.nagative number + positive number => -5 + 7=> 2


    @Test
    public void should_add_positive_values(){
        AddOperation addOperation = new AddOperation() ;
        double result = addOperation.execute(new double[]{2.0, 2.0}) ;

        assertThat(result, is(4.0));
    }

    @Test
    public void should_add_zeros(){
        AddOperation addOperation = new AddOperation() ;
        double result = addOperation.execute(new double[]{0.0, 0.0}) ;

        assertThat(result, is(0.0));
    }

    @Test
    public void should_add_negative_values(){
        AddOperation addOperation = new AddOperation() ;
        double result = addOperation.execute(new double[]{-8.0, -7.0}) ;

        assertThat(result, is(-15.0));
    }

}