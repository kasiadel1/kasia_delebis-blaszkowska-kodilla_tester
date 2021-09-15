import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int sum = 0; //initialise my  sum
        int min = 30;
        int max = 0;


        while(sum < 5000) {

            int num = random.nextInt(31);
            System.out.println("Random number " + num);
            //add my random num to the sum
           // sum += num;
            // inny zapis
            sum = sum + num;
            if(num>max) max = num;
            if(num<min) min =num;
            System.out.println("Current sum " + sum);
            System.out.println("Sum " + sum+  " not exceeds 5000");
            System.out.println("Highest number is :"  + max);
            System.out.println("Lowest number is: : " + min);
        }



    }
}