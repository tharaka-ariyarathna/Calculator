package com.kelaniya.uni.V5.Operation;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {
    //1.if operator is add -> should return object of AddOperation class
    @Test
    public void shouldReturnAddOperationObjectifTheOperatorIsadd(){
        OperationFactory operationFactory = new OperationFactory() ;
        Operation operation = operationFactory.getOperator("add") ;
        //Verify that operation object is an instance of addOperation class
        assertThat(operation, instanceOf(AddOperation.class));

    } ;

    //2.if operator is sub -> should return object of subOperation class
    @Test
    public void shouldReturnSubOperationObjectifTheOperatorIssub(){
        OperationFactory operationFactory = new OperationFactory() ;
        Operation operation = operationFactory.getOperator("sub") ;
        //Verify that operation object is an instance of addOperation class
        assertThat(operation, instanceOf(SubOperation.class));

    } ;
    //3.if operator is mul -> should return object of mulOperation class
    @Test
    public void shouldReturnMulOperationObjectifTheOperatorIsmul(){
        OperationFactory operationFactory = new OperationFactory() ;
        Operation operation = operationFactory.getOperator("mul") ;
        //Verify that operation object is an instance of addOperation class
        assertThat(operation, instanceOf(MulOperation.class));

    } ;
    //4.if operator is div -> should return object of divOperation class
    @Test
    public void shouldReturnDivOperationObjectifTheOperatorIsdiv(){
        OperationFactory operationFactory = new OperationFactory() ;
        Operation operation = operationFactory.getOperator("div") ;
        //Verify that operation object is an instance of addOperation class
        assertThat(operation, instanceOf(DivOperation.class));

    } ;
}