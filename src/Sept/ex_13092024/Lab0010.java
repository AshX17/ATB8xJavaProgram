package Sept.ex_13092024;

public class Lab0010 {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Ashitosh" + new_line + "Kadam");
        System.out.println("Ashitosh" + tab_line + "Kadam");
        System.out.println("Ashitosh" + back_space + "Kadam");
        System.out.println("Ashitosh" + car_r + "Kadam");

        System.out.println("Ashitosh" + '\n' + "Kadam");
        System.out.println("Ashitosh" + '\t' + "Kadam");
        System.out.println("Ashitosh" + '\b' + "Kadam");
        System.out.println("Ashitosh" + '\r' + "Kadam");

    }
}
