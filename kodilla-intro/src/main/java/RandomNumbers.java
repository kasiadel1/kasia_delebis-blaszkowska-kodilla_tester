import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int sum = 0; //initialise my  sum

        while(sum < 5000) {

            int num = random.nextInt(31);
            System.out.println("Random number " + num);
            //add my random num to the sum
           // sum += num;
            // inny zapis
            sum = sum + num;
            System.out.println("Current sum " + sum);
            System.out.println("Sum " + sum+  " not exceeds 5000");

        }


    }
}