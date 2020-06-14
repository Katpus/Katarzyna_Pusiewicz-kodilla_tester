public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "cat";
        animals[1] = "dog";
        animals[2] = "cow";
        animals[3] = "rabbit";
        animals[4] = "mouse";
        String animal = animals[3];
        int numberOfElements = animals.length;
        System.out.println("moja tablica zawiera "+ numberOfElements + " elementów");
    }
}
