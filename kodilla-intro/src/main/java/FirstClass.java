
public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("1800", 1000 , 2020);
        System.out.println(notebook.weight + " " + notebook.price + " "  + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook("1900", 900, 2021);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();


        Notebook oldNotebook = new Notebook("1800", 1600, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price  + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();

    }
}