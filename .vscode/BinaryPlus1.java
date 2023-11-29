import java.util.Scanner;

public class BinaryPlus1 {
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a binary number");
            String binary = input.nextLine();
            System.out.println(DecToBi(binary));
        }
    }
    public static String DecToBi(String binary){
        int wasChanged = 0;
        for(int pos = 0; pos < 4; pos++){
            if(binary.substring(pos).equals("1".repeat(4 - pos))){
                binary = binary.substring(0, pos - 1) + "1";
                binary = binary.substring(0, pos) + "0".repeat(4 - pos);
                wasChanged = 1;
            }else if(pos == 3 && wasChanged == 0){
                binary = binary.substring(0,pos) + "1";
            }
        }
        return binary;
    }

}