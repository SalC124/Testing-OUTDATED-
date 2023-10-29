import java.util.Scanner;
import java.lang.Math; 
public class QuadraticFormula{
  public static void main(String args[]){
    try (Scanner input = new Scanner(System.in)) {
      // inputs:
      System.out.println("What is a?");
      double a = input.nextDouble();
      System.out.println("What is b?");
      double b = input.nextDouble();
      System.out.println("What is c?");
      double c = input.nextDouble();
      // Calculations:
      double underRad = (b * b) - (4 * a * c);
      if(underRad >= 0){
        double sqrted = Math.sqrt(underRad);
        System.out.println("Solutions:");
        // Solution 1:
        double numer1 = (-1 * b) + sqrted;
        double solution1 = numer1 / (2 * a);
        // Solution 2:
        double numer2 = (-1 * b) - sqrted;
        double solution2 = numer2 / (2 * a);
        if(solution1 == solution2){
          System.out.println("x = " + solution1);
        }else if(numer1 == 0){
          System.out.println("x = 0");
        }else if(solution1 == solution2 * -1){
          System.out.println("x = +-" + solution1);
        }else{
          System.out.println("x = " + solution1);
          System.out.println("x = " + solution2);
        }
      }else{
        double sqrted = Math.sqrt(underRad * -1);
        System.out.println("Solutions (Non-Real):");
        // Solution i:
        double left = (-1 * b) / (2 * a);
        double right = sqrted / (2 * a);
        String solution1 = (left + " +- " + right + "i");
        System.out.println("x = " + solution1);
        // Solution with radical still:
        System.out.println("Solutions (Unsimplified):");
        System.out.println("x = " + left + " +- sqrt(" + underRad + ") / " + (2 * a));
      }
    }    
  }
}