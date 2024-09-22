package Sept.ex_18092024;

public class Lab0016_Assignment_18thsep_Q1 {

    public static void main(String[] args) {
        // widening
     /*   int purchase_price = 10;
        float transport_price = 5.25f;

        double selling_price = purchase_price + transport_price;

        System.out.println(selling_price);*/

        //  narrowing;

        int purchase_price = 10;
        float transport_price = 10.25f;

        int selling_price = purchase_price + (int)transport_price;
        System.out.println(selling_price);
    }
}
