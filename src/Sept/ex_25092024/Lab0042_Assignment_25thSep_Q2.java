package Sept.ex_25092024;

import java.util.Scanner;

public class Lab0042_Assignment_25thSep_Q2 {
    public static void main(String[] args) {
        System.out.printf("Ans2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.printf("Factorial of %d: ",num);
        int factorial = 1;
        for(int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
