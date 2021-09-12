package com.kelaniya.uni.V1;

import java.io.File;
import java.util.Scanner;

public class file {
    Scanner scanner ;

    public void openFile(){
        try{
            scanner = new Scanner(new File("Numbers.txt")) ;
        }catch (Exception e){
            System.out.println("Could't read from file");
        }
    }

    public int readFile(){
        String num = scanner.next() ;
        int number = Integer.parseInt(num) ;
        return number ;
    }
}
