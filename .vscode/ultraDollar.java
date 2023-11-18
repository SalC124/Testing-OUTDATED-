import java.util.Scanner;
public class ultraDollar {
    public static void main(String [] Args) {
        try (Scanner input = new Scanner(System.in)) {
        int end = 0;

        while(end != 3) {
            System.out.println();
            System.out.println("USD -> ULTRADOLLAR: 1");
            System.out.println("ULTRADOLLAR -> USD: 2");
            System.out.println("End Process:        3");
            int selection = input.nextInt();
            if(selection == 1) {
                System.out.println("What is the amount of USD?");
                double USDamount = input.nextDouble();
                System.out.println("$" + USDamount + " = P" + USDamount * 0.000012486732);
            }else if(selection == 2) {
                System.out.println("What is the amount of P?");
                double Pamount = input.nextDouble();
                System.out.println("P" + Pamount + " = P" + Pamount * 80085);
            }else if(selection == 3) {
                System.out.println("END");
                end = 3;
            } else {
                System.out.println("YOUR CRIME IS EXISTENCE");
                end = 3;
            }
        }
    }
}
}
