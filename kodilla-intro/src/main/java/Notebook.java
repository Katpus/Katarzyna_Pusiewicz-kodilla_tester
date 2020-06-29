public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void theBestChoice() {
        if (this.price < 600 && this.year > 2015) {
            System.out.println("The best choice ever");
        } else if (this.price > 700  && this.year > 2000) {
            System.out.println("Could be better.");
        } else if (this.price > 1000 && this.year < 2000) {
            System.out.println("Please, don't buy it.");
        }
    }
}