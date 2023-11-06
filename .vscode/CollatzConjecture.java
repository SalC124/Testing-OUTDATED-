import java.util.Scanner;
public class CollatzConjecture{
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("What is the starting number?");
            int num = input.nextInt();
            int counter = 1;
            System.out.println(counter + ": " + num);

            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                System.out.println(counter + ": " + num);
                counter++;
            }
        }
    }
}