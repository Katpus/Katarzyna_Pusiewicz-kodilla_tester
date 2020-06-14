public class LeapYear {
    public static void main(String[] args) {

//        int year = 2017;
//        if (year % 4 == 0) {
//            System.out.println("Not a Leap Year");
//        } else if (year % 100 == 0) {
//            System.out.println("It's the Leap Year");
//        } else if (year % 400 == 0) {
//            System.out.println("Not a Leap Year");
//        } else {
//            System.out.println("It's the Leap Year");
//        }
        System.out.println(yearCheck(2020));
        System.out.println(yearCheck(2019));
        System.out.println(yearCheck(1954));
        System.out.println(yearCheck(34));

    }

    public static boolean yearCheck(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
