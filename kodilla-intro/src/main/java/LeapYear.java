public class LeapYear {
    public static void main(String[] args) {
        int year = 1888;


        if (year % 4 == 0) {
           if (year % 100 == 0) {
                if (year % 400 == 0) {
                   System.out.println("It's a leap year");
               } else {
                   System.out.println("It's not a leap year");
               }
            } else {
                System.out.println("It's a leap year");
           }
        } else {
            System.out.println("It's not a leap year");
        }
    }
}

