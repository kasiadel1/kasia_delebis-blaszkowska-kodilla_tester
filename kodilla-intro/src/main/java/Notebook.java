public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
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
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        }
        if (this.weight > 1000 && this.weight < 3000) {
            System.out.println("This netbook is not too heavy");
        }
        if (this.weight > 3100) {
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

