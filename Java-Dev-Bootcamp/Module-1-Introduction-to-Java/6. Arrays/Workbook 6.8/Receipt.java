public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");
        
        String appleArray[] = {"Gala", "Granny Smith", "Macintosh"};
        // See instructions on Learn the Part (Workbook 6.8)
        double applePrice[] = {1.99, 1.49, 1.29};

        for(int i = 0;i < appleArray.length;i++){
        System.out.println("\t" + appleArray[i] + ": $" + applePrice[i]); // to be used in for loop.
        }
    }
}
