import java.util.Scanner;
import java.lang.Math; 
public class RadicalSimplifying{
  public static void main(String args[]){
    try (Scanner input = new Scanner(System.in)) {
      // inputs:
      System.out.println("What is underRad?");
      double underRad = input.nextDouble();
      System.out.println("What is left?");
      double left = input.nextDouble();
      // Calculations:
      // This tries to find the largest factor of underRad
      int underRadTry =  0;
      while (underRadTry <= underRad) {
        underRadTry++;
      }
        underRadTry -= 1;
        underRad %= underRadTry;

        System.out.println(underRad);
        
        double radCoef = Math.sqrt(underRadTry);

        System.out.println(radCoef);

        System.out.println("x = " + left + " +- " + radCoef + "sqrt(" + underRad + ")");





    }
  }
}