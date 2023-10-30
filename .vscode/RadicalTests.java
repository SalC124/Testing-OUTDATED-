import java.util.Scanner;
public class RadicalTests{
  public static void main(String args[]){
    try (Scanner input = new Scanner(System.in)) {
      // inputs:
      System.out.println("What is underRad?");
      double underRad = input.nextDouble();
      // Calculations:
      // This tries to find the largest factor of underRad
      int underRadTry =  0;
      int Coef = 0;
      double underRadNoveau = 0;

      while (underRadTry * underRadTry <= underRad) {
        if(underRad % (underRadTry * underRadTry) == 0){
            Coef = underRadTry;
        }
        underRadTry++;
        underRadNoveau = underRad / (Coef * Coef);
        System.out.println("underRadWorks: " + Coef + "; Trial: " + underRadTry + "; underRadNoveau: " + underRadNoveau);
      }
        System.out.println("");
        System.out.println("x = +- " + Coef + "sqrt(" + underRadNoveau + ")");
    }
  }
}