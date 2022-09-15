import java.util.Scanner; //Calls scanner utility for tasks such as recording input. Could also just use .* instead is you want

class CircleArea { //Class could be public or private, that will be explored later
    public static void main(String[] args) { //All java programs need this to run. 
        final double Pi = 3.1425; //final keyword makes this double constant. Good for values like Pi, which is always 3.14 blah blah

        Scanner scan = new Scanner(System.in); //You are creating an instance of the class Scanner. We call it scan and you're saying it's a new Scanner that accepts input (System.in)

        System.out.print("Input the radius: ");
        
        int circle_radius = scan.nextInt(); //User input will go here. You're using the method nextInt(), which takes an integer

        double circleArea = Pi * (circle_radius * circle_radius); // Official formula is r to the second power, so the radius must be multiplied first

        System.out.println("If the radius of a circle is " + circle_radius + ", what is the area?" );

        System.out.println("The area is: " + circleArea);

    }
}