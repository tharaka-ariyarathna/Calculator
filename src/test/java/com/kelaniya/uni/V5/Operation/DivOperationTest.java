package com.kelaniya.uni.V5.Operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_devide_positive_value() throws InvalidOperationException {
        DivOperation divOperation = new DivOperation() ;
        double result = divOperation.execute(new double[]{4.0, 2.0});
        assertThat(result, is(2.0));
    }

    @Test
    public void shoul_not_devide_by_zero() throws InvalidOperationException {
        DivOperation divOperation = new DivOperation() ;
        assertThrows(InvalidOperationException.class, ()-> {
            divOperation.execute(new double[]{6.0, 0.0}) ;
        }) ;
    }
}