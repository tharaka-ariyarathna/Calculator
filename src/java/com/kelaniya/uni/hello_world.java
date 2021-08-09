package com.kelaniya.uni;

public class hello_world {
    public static void main(String[] args) {
        file newFile = new file() ;
        userInput newInput = new userInput() ;
        Calculation newcalc = new Calculation() ;
        newFile.openFile();
        int number1 = newFile.readFile() ;
        int numbe2 = newFile.readFile() ;
        int input = newInput.input() ;
        newcalc.calculator(input , number1 , numbe2);
    }
}
