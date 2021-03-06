package com.kelaniya.uni.V3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public double[] getNumbers() throws IOException {
        List<String> numbersStr = Files.readAllLines(Paths.get("Numbers.txt"));

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        return new double[]{number1, number2};
    }
}
