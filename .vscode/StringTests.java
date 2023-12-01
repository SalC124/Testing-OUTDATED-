import java.util.Scanner;
import java.lang.Math;
public class StringTests{
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("enetr how many thimes you want a to be");
            int N = input.nextInt();
            String newString = "a".repeat(N);
            System.out.println(newString);

            System.out.println("what is the deciaml numebr?");
            int decimal = input.nextInt();

            int bits;
            for(bits = 1; decimal + 1 > Math.pow(2,bits);bits++){

            }
            System.out.println(bits);

        }
    }
}