package Sept.ex_20092024;

public class Lab0023_Assignment_20thsep_Q1 {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;
        int c = 45;
        int max = a > b ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println(max);

    }
}