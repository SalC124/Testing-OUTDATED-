public class Testing {
    public static void main(String[] args) {
  
    int counter = 0;
    int squared = counter * counter;
    while (counter <= 1000) {
      squared = counter * counter;
      System.out.println(counter + " times " + counter + " equals " + squared);
      counter++;
    }

    }
}