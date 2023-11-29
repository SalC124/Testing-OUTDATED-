import java.util.Scanner;
public class StringTests{
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)){
            int N = input.nextInt();
            String newString = "a".repeat(N);
            System.out.println(newString);
        }
    }
}