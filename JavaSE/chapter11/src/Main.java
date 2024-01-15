import jdk.nashorn.internal.parser.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        numsList.add(0);
        numsList.add(1);
        Object[] array = numsList.toArray();
        for (Object o: array
             ) {
            System.out.println(o);
        }
    }
}