package Sept.ex_25092024;

import java.util.Scanner;

public class Lab0044_Assignment20thSep_Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n=100");
        int n = sc.nextInt();

        for (int i = 1; i <=100 ; i++) {
            if (i% 3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");}
            else if (i%5 ==0) {
                System.out.println("Buzz");}
            else {
                System.out.println(i);}

            }

        }

        }


