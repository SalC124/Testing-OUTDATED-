import java.util.Scanner;
public class allCoordinates {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in);){
            for(int i=0;i<=1000;i++){
                for(int p=0;p<=1000;p++){
                    System.out.print("("+i+","+p+")");
                }
            }
        }
    }
}