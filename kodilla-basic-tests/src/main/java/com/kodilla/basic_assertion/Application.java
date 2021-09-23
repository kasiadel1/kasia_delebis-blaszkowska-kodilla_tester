package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        int substractResult = calculator.substract(a,b);
        int squaredResult = calculator.squared(a);

boolean correctSum = ResultChecker.assertEquals(13, sumResult);
if (correctSum){
    System.out.println("Metoda  sum dziala poprawnie dla liczb "  + a + "i " + b);
}else{
    System.out.println("Metoda  sum nie dziala poprawnie dla liczb "  + a + "i " + b);
}


        boolean correctSub = ResultChecker.assertEquals(-3, substractResult);
        if (correctSub){
            System.out.println("Metoda  odejmowania  dziala poprawnie dla liczb "  + a + " i " + b);
        }else{
            System.out.println("Metoda  odejmowania nie dziala poprawnie dla liczb "  + a + " i " + b);
        }



        boolean correctSquare = ResultChecker.assertEquals(25, squaredResult);
        if (correctSquare){
            System.out.println("Metoda  potęgowania  dziala poprawnie dla liczby "  + a );
        }else{
            System.out.println("Metoda  potęgowania nie dziala poprawnie dla liczby "  + a );
        }





    }






}
