package com.kelaniya.uni.V5.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{

    public double[] getNumbers() throws numberRepositoryException {
        List<String> numbersStr = null;
        try {
            numbersStr = Files.readAllLines(Paths.get("Numbers.txt"));
        } catch (IOException e) {
            throw new numberRepositoryException(e, "couldn't read the text file") ;
        }

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        return new double[]{number1, number2};
    }
}
