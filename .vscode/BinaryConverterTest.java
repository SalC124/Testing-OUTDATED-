import java.util.Scanner;
import java.lang.Math;
public class BinaryConverterTest {
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println();
            int end = 0;

            while (end != 3) {
                System.out.println();
                System.out.println("DECIMAL -> BINARY: 1");
                System.out.println("BINARY -> DECIMAL: 2");
                System.out.println("End Process:       3");
                int selection = input.nextInt();
                if (selection == 1) {
                    System.out.println("INPUT THE DECIMAL NUMBER");
                    int decimal = input.nextInt();
                    System.out.println("INPUT THE NUMBER OF BITS");
                    int bits = input.nextInt();

                    System.out.println(D2B(bits,decimal));

                } else if (selection == 2) {
                    System.out.println("INPUT THE BINARY NUMBER");

                } else if (selection == 3) {
                    System.out.println("END");
                    end = 3;
                } else {
                    System.out.println("YOUR CRIME IS EXISTENCE");
                    end = 3;
                }
            }
        }
    }
    public static String D2B(int bits, int decimal){
        String placeholder = ("00000000000000000000000000000000");
        int HAMMER = 32 - (32 - bits);
        String value = placeholder.substring(HAMMER,32);
        //int value = 0;
        int counter = 1;
        for(int i = bits; i > 0; i--){
            if(decimal - Math.pow(2,i) >= 0){
                value = value.substring(0, counter) + 1
                        + value.substring(counter + 1);
            }
            counter++;
        }
        return value;
    }
}