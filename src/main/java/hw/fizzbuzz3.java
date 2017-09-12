//package hw;
import java.util.Scanner;
public class fizzbuzz3 {
 public static void main(String[] args) {
     
   System.out.println("input a number to determine fizzbuzz and have it entered into an array: ");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for (int i = 1; i <= n; i++) {
    if ((i % 3 == 0) && (i % 5 == 0)) {
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
 

 public static String[] fizzbuzzArray(final int n) {
  if (n >= 1) {
   String[] testArray = new String[n];
   for (int i = 1; i <= n; i++) {
    if ((i % 15) == 0) {
     testArray[i] = "fizz buzz";
    } else if (i % 5 == 0) {
     testArray[i] = "buzz";
    } else if (i % 3 == 0) {
     testArray[i] = "fizz";
    } else {
     testArray[i] = String.valueOf(i);
    }
     
   }

   return testArray;
  }
  return null;
 }
}