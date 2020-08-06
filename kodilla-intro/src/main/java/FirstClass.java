public class FirstClass {
    public static void main(String[] args) {
        Notebook blacknotebook = new Notebook(700, 800, 2001);
        Notebook greenNotebook = new Notebook(1100, 500, 2019);
        Notebook blueNotebook = new Notebook(1600, 1500, 1996);
        Notebook pinkNotebook = new Notebook ( 7000, 2000, 1995);
        Notebook yellowNotebook = new Notebook (4000, 3700, 2018);
        Notebook greyNotebook = new Notebook( 850, 6000, 2014);

        System.out.println(blacknotebook.weight + " " + blacknotebook.price + " " + blacknotebook.year);
        blacknotebook.theBestChoice();
        System.out.println(greenNotebook.weight + " " + greenNotebook.price+ " " + greenNotebook.year);
        greenNotebook.theBestChoice();
        System.out.println(blueNotebook.weight + " " + blueNotebook.price + " " + blueNotebook.year);
        blueNotebook.theBestChoice();
        System.out.println(pinkNotebook.weight + " " + pinkNotebook.price + " " + pinkNotebook.year);
        pinkNotebook.theBestChoice();
        System.out.println(yellowNotebook.weight + " " + yellowNotebook.price + " " + yellowNotebook.year);
        yellowNotebook.theBestChoice();
        System.out.println(greyNotebook.weight + " " + greyNotebook.price + " " + greyNotebook.year);
        greyNotebook.theBestChoice();

    }
}