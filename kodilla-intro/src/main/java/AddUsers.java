public class AddUsers {
    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};


        int result = 0;
        for (int i = 0; i < users.length; i++) {

            result = result + users[i].getAge();
            System.out.println("Age sum of  " + (i+1)  + " users is:  " + result);// jak wyswietlic rezultat z ostatniej iteracji
        }


        int average = result / users.length;


        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName() + "'s age " + "is lower than " + average);

            }
        }

    }

}

