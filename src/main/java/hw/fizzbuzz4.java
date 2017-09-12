//package hw;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class fizzbuzz4 {
    public static void main(String[] args) {

        System.out.println("input a number to determine fizzbuzz and have it entered into an list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((i % 15) == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static List < String > fizzBuzz(int n) {
        List < String > wholeList = new ArrayList < String > ();
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                if ((i % 15) == 0) {
                    wholeList.add("Fizz Buzz");
                } else if (i % 3 == 0) {
                    wholeList.add("Fizz");
                } else if (i % 5 == 0) {
                    wholeList.add("Buzz");
                } else {
                    wholeList.add(String.valueOf(i));
                }
            }
            return wholeList;
        }
        return null;
    }
}