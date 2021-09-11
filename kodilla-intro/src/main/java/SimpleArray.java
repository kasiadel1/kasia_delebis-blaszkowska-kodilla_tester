public class SimpleArray {
    public static void main(String[] args){
        String[] favouriteFood = new String[5];
        favouriteFood[0] ="Pizza";
        favouriteFood[1] ="Lasagne";
        favouriteFood[2] = "Burger";
        favouriteFood[3] = "Spaghetti";
        favouriteFood[4] = "Risotto";

        String favFood = favouriteFood[3];
        System.out.println(favFood);

       int numberOfElements = favouriteFood.length;
        System.out.println ("Moja tablica zawiera " + numberOfElements  + " " + "elementów");

    }
}

