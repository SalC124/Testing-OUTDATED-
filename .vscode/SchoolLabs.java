// Full Name: Salvatore Calafiore
// Teacher & Period: Mr. Sen Pd: 9
// Help cited: ______

import java.util.Scanner;
class SchoolLabs{
  public static void main(String[] args) {

  try (Scanner input = new Scanner(System.in)) {
    // Piles and Stones:
      int pile1 = 9;
      int pile2 = 9;
      int pile3 = 9;
      int playerCounter = 0;
      String player = "burger";
        // Loop:
        // States the "score":
        while(pile1 + pile2 + pile3 != 0) {
            System.out.println("Pile 1: " + pile1);
            System.out.println("Pile 2: " + pile2);
            System.out.println("Pile 3: " + pile3);
            // Determines player based on a counter and modulus
            if(playerCounter %2 == 0) {
                player = "Player 1";
            }else{
                player = "Player 2";
            }
                // What pile are you taking from?
                System.out.println(player + ", what pile will you take from, 1, 2, or 3?");
                int pileChoice = input.nextInt();
                if(pileChoice == 1) {
                    System.out.println("How many stones would you like to take?");
                    int takeAmount = input.nextInt();
                    pile1 -= takeAmount;
                }
                if(pileChoice == 2) {
                    System.out.println("How many stones would you like to take?");
                    int takeAmount = input.nextInt();
                    pile2 -= takeAmount;
                }
                if(pileChoice == 3) {
                    System.out.println("How many stones would you like to take?");
                    int takeAmount = input.nextInt();
                    pile3 -= takeAmount;
                }
                playerCounter++;
        }
        // Also determines the player, but is no longer only in the while loop:
        if(playerCounter %2 == 0) {
                player = "Player 1";
            }else{
                player = "Player 2";
            }
        // Prints who won:
        System.out.println(player + " won!!");
}
  }
}