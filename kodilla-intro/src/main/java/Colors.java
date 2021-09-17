
import java.util.Scanner;

public class Colors {
    public static String enterFirstLetter() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type first letter(choose from :B,R,Y,G) : ");
            String firstLetter = scanner.nextLine().trim().toUpperCase();
            switch (firstLetter) {
                case "B":{
                    System.out.println("the color is: Black");
                }
                    break;
                case "R":{
                        System.out.println("The color is :Red");
                }
                    break;

                case "Y":{
                    System.out.println("The colors is :Yellow");
                }
                    break;

                case "G":{
                    System.out.println("The colors is :Green");
                }
                default:
                    System.out.println("You chose wrong first letter.Try again");

            }


        }

    }
}