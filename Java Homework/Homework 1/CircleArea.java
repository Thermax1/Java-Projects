// This calls the Scanner utility.
// You can also just use java.util.*; for all of them
import java.util.Scanner;

class CircleArea {
  
  public static void main(String[] args) {

    final double Pi = 3.1425; // this will make sure that Pi remains constant

    Scanner scan = new Scanner(System.in);  // You are creating an instance of the class Scanner

    // Its called scan and you're saying it's a new Scanner that accepts input (System.in)

    System.out.print("Input the radius: ");
    int circle_radius = scan.nextInt(); //User input will go here. You are using the method nextInt(), which takes an integer

    double circleArea = Pi * (circle_radius * circle_radius); // The official formula is r to the second power, so the radius must be multiplied first

    System.out.println("If the radius of a circle is " + circle_radius + ", what is the area?");
    System.out.println("The area is: " + circleArea);
    
  }
}