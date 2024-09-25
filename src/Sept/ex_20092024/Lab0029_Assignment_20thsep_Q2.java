package Sept.ex_20092024;


public class Lab0029_Assignment_20thsep_Q2 {
    public static void main(String[] args) {
      char grade = 'F';
      int score = 85;
      if (score >= 90 && score <= 100){
          grade = 'A';
      } else if (score >=80 && score <=89) {
          grade = 'B';
          } else if (score >=70 && score <= 79) {
          grade = 'C';
      } else if (score >=60 && score <= 69) {
                grade = 'D';
      } else if (score >=50 && score <= 59) {
          grade = 'E';
      } else if (score <=0 || score > 100) {
          System.out.println("LOL!!, are you God?");
          grade = '0';
      } else {
          grade = 'F';
      }
        System.out.println("Your grade is ->" + grade);

    }


    }