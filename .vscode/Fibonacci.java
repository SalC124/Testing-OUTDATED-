import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {

            int num1 = 0;
            int num2 = 1;
            int num3 = 1;
            System.out.print(num1 + ", " + num2 + ", ");
            while(num3 > 0){
                num3 = num1 + num2;
                System.out.print(num3 + ", ");
                num1 = num2;
                num2 = num3;
            }
            	
        }
    }
}