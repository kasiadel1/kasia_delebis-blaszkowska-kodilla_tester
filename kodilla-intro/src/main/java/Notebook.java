public class Notebook {
    String weight;
    int price;
    int year;


    public Notebook(String weight, int price, int year) {
        this.price = price;
        this.weight = weight;
        this.year = year;


    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        }
        if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is very expensive");
        }
    }

    public void checkWeight() {
        weight= weight.substring(0,weight.length()-1);
        int weight1 = Integer.parseInt(weight);
        if (weight1 < 1000) {
            System.out.println("This notebook is light");
        }
        if (weight1 > 1000 && weight1 < 3000) {
            System.out.println("This netbook is not too heavy");
        }
        if (weight1 > 3100) {
            System.out.println("This notebook is very heavy");
        }
    }

        public void checkYear () {
            if (this.price  < 1500 && this.year > 2018) {
                System.out.println("It sounds like a good deal");
            } else if(this.price >1500  && this.year < 2018) {
                System.out.println("Outdated for this price ");
            }else if(this.price < 1000 && this.year  > 2020) {
                System.out.println("It's a rip off");
            }

        }
}

