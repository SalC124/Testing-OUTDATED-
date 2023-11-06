public class CollatzConjectureInfinite{
    public static void main(String args[]){

            int numInit = 1;
            int num = 1;
            while(num != 0){
            num = numInit;
            int counter = 1;
            System.out.println(counter + ": " + num);

            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                System.out.println(counter + ": " + num);
                counter++;
                numInit++;
            }
                counter++;
                numInit++;
        }
    }
}