public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("700g", 800, 2001);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.theBestChoice();

        Notebook heavyNotebook = new Notebook("500g", 500, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price+ " " + heavyNotebook.year);
        heavyNotebook.theBestChoice();

        Notebook oldNotebook = new Notebook("1600g", 1500, 1996);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.theBestChoice();

    }
}