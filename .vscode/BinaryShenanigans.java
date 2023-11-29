import java.util.Scanner;
public class BinaryShenanigans {
    public static void main(String[] Args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input a decimal");
            int decimal = input.nextInt();
            System.out.println("Input the amount of bits");
            int bits = input.nextInt();
            System.out.println(DecToBi(decimal,bits));
        }
    }
    public static String DecToBi(int decimal, int bits){
        String binary = "0".repeat(bits);
        int ogBinaryLength = binary.length();
        for(int i = 1; i <= decimal; i++) {
            int wasChanged = 0;
            for(int pos = 0; pos < ogBinaryLength; pos++){
                if(binary.substring(pos).equals("1".repeat(ogBinaryLength - pos))){
                    binary = binary.substring(0, pos - 1) + "1";
                    binary = binary.substring(0, pos) + "0".repeat(ogBinaryLength - pos);
                    wasChanged = 1;
                }else if(pos == ogBinaryLength - 1 && wasChanged == 0){
                    binary = binary.substring(0,pos) + "1";
                }
            }
        }return binary;
    }
}