package projectTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    // create a method and it should return List of integers
    // fibonacci is as you is
    // the sequence follows the rule that each number is equal to the sum of the preceding two numbers.
    // you will be giving point when you get hired it is widely used in Agile Scrum methodologies


    public static void main(String[] args) {
        List<Integer> fibList = fibonacci(10); // generate the first 10 Fibonacci numbers
        for (int num : fibList) {
            System.out.print(num + " ");
        }
        System.out.println(fibList);
    }

    // solved already
    public static List<Integer> fibonacci(int n) {

        List<Integer> fibList = new ArrayList<Integer>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibList.add(a);
            int c = a + b;
            a = b;
            b = c;
        }
        return fibList;
    }

}
