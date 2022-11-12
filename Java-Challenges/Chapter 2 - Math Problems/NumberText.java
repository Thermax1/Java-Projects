public class NumberText {

    //create array with words 0 - 9
    // Take number and turn into string
    //compare index position to array and print out correct input
    static String numberAsText(final int n){

        final int remainder = n % 10;
        String valueAsText = "";

        if(remainder == 0)
            valueAsText = "ZERO";

        if(remainder == 1)
            valueAsText = "ONE";

        
    }
}
