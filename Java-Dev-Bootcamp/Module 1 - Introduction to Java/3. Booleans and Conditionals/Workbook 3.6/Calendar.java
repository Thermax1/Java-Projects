public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Tuesday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.\n");
        
        switch (day) {
            case "Monday": System.out.println("Sorry, I'm working late!"); break;
            case "Tuesday": System.out.println("I have meetings all day!"); break;
            case "Wednesday": System.out.println("I have a dentist appointment"); break;
            case "Thursday": System.out.println("I have date night!"); break;
            case "Friday": System.out.println("I'M FREE"); break;
            case "Saturday": System.out.println("I'M FREE"); break;
            case "Sunday": System.out.println("I'M FREE"); break;
            default: System.out.println("Invalid day of the week. Misspelled?");
        }     
        

    }
}
