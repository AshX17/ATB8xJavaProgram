package Sept.ex_20092024;

public class Lab0030 {
    public static void main(String[] args) {
        char grade = 'F';
        int score = 60;
        if (score >= 55 && score <= 100) {
            grade = 'A';
        } else if (score >= 54 && score <= 35) {
            grade = 'B';
        } else if (score >= 10 && score <= 34) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is ->" + grade);

    }
}
