public class RandomNumbers {
    public static void main(String[] args) {

        int[][] array = new int[100][10];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = randomNumber();
            }
        }
        print2DArray(array);
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(int[][] myArray){
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
