package Assignment_task;

public class Print_even_number_27thSep_Q1 {
    public static void main(String[] args) {
        int number = 2;
        int count = 1;
        do {
            if (number %2 ==0) {
                System.out.println(number);
                count++;
            }
            number++;
        }	while (count<=5);
    }
}
