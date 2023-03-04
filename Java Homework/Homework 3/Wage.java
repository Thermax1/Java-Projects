import java.util.Scanner;

class Wage {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int hr;

    System.out.println("Enter the number of hours");
    hr = scan.nextInt();

    System.out.println("The number of hours is " + hr);

    double firstMethod;
    firstMethod = 10 * hr;
    System.out.println("method 1 pay is " + firstMethod);

    double rate = .10;
    double amt = 0;

    for (int i=0; i<hr; i++) {
      amt = amt + rate;
      rate = rate * 2;
    }
    System.out.println("method 2 pay is " + amt);

    // -----  *** part II ----
    double rt = .10;
    int hour = 0;
    double method1 = 0;
    double method2 = 0;

    while (method1 >= method2) {
       hour++;
       method1 = 0;
       method2 = 0;
       rt = .10;

       method1 = 10 * hour;

       for (int i=1; i<=hour; i++) {
         method2 = method2 + rt;
         rt = rt * 2;
       }

    }

   System.out.println("method2 becomes better than method1 at: " + hour + " hours");
    
  }

}