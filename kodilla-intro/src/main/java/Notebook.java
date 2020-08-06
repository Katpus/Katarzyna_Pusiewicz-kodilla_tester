public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void theBestChoice() {
        if (this.price < 2000 && this.year > 2015 && this.weight < 1200) {
            System.out.println("The best choice ever");
        }
    }
}
