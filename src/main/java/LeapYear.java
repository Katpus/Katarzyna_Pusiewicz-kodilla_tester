public class LeapYear {
    public static void main(String[] args) {

      int year = 2017;
      int case1 = 4;
      int case2 = 100;
      int case3 = 400;

        int result1 = year % case1;
        int result2 = year % case2;
        int result3 = year % case3;



        if (result1 > 0){
            System.out.println("Not a Leap Year");
        } else if (result2 > 0 ) {
            System.out.println("It's the Leap Year");
        } else if (result3 > 0){
            System.out.println("Not a Leap Year");
        } else {
            System.out.println("It's the Leap Year");
        }





    }
}
