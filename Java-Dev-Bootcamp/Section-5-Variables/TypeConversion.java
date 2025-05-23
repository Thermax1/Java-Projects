public class TypeConversion {
    public static void main(String[] args) {
        int ants = 2000;
        int purchasedCheese = 1;

        System.out.println("There are " + ants + "ant, and " + purchasedCheese);
        System.out.println("Each ant carried " + (double)purchasedCheese / ants + " from the total cheese amount");
        
        double salary = 5423.94;
        int roundedSalary = (int)salary;

        System.out.println("Mortgage Broker: What is your monthyl salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);
    }
}
