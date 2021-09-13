/*
public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;


        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
*/



public class Application {
    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);

        System.out.println("Name: " + adam.name);
        System.out.println("Age: " + adam.age);
        System.out.println("Height: " + adam.height);
        adam.comparison();
    }
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

  public void comparison() {
      if (this.name == null) {
          return;
      }

      if (this.age > 30 && this.height > 160) {
          System.out.println("User is older than 30 and higher than 160cm");
      } else {
          System.out.println("User is 30 (or younger) or 160cm (or shorter)");
      }
  }


  }

