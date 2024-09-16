public class Chap2Exercise {

    public static void main(String[] args) {
        String dinoBreed = "T-Rex";
        int dinoHeight = 12;
        int dinoLength = 40;
        int dinoWeight = 11_000;
        String dinoName = "Fred";
        int dinoAge = 5;
        String dinoDiet = "carnivore";
        int maxVisitors = 1_000;
        int employeeAge = 30;
        String employeeName = "Tom";
        int dinoPop = 50;
        int safetyRating = 10;
        char dinoReference = 'T';

        System.out.println("A " + dinoBreed + " that can grow up to " + dinoHeight + " feet high, " + dinoLength + " feet long, and can weigh " + dinoWeight + " pounds or more!");

        System.out.println("This T-Rex is called " + dinoName + ". He is " + dinoAge + " years old and he eats other animals. This means he is a " + dinoDiet + "!");

        System.out.println("There's a maximum of " + maxVisitors + " people allowed in Mesozoic Eden per day.");

        System.out.println("Our best employee's name is " + employeeName + " and he's " + employeeAge + " years old.");

        System.out.println("We currently have " + dinoPop + " dinosaurs at Mesozoic Eden.");

        System.out.println("We currently hold a safety rating of " + safetyRating + "!");

        System.out.println("In our referencing system, T-Rex is searched by typing in the letter " + dinoReference + ".");
    }
}
