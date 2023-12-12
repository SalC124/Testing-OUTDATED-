import java.util.Scanner;
public class PiecewiseDesmosToUrl {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Desmos Gobbledygook");
            String str = input.nextLine();
            System.out.println(str);
        }
    }
    public static String converter(String str){
        for(int pos = 0; pos < str.length(); pos++){
            if(str.substring(pos,pos + 4).equals("left")){
                str.substring(pos - 1,pos + 4);
            }else if(str.substring(pos,pos + 5).equals("right")){
                str.substring(pos - 1,pos + 5);
            }
        }
        return str;
    }
}