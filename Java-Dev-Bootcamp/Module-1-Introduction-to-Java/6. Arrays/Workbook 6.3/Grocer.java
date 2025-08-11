public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).

        String[] groceries = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");
        String itemWanted = "coffee";
        int itemNumber = 0;

        for(int i = 0; i < groceries.length;i++){
            if (groceries[i] == itemWanted){
                itemNumber = i;
            }
        }
        System.out.println("\nWe have that in aisle: " + itemNumber);
    
    }
}
