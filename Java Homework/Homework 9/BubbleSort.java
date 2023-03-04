class BubbleSort {

  public static void printArray(int[] myArray) {

    for (int i=0;i<myArray.length; i++)
      System.out.print(myArray[i] + " , ");
    System.out.println("");

  }

//bubble sort
  public static void bubbleSort(int[] myArray) {

    int len = myArray.length;
    int nextPos;
    int temp;
    for (int m=len; m>0; m--) {
      for (int i=0; i<m-1; i++) {
      	nextPos = i + 1;
        if (myArray[i] > myArray[nextPos]) {
	    temp = myArray[i];
          myArray[i] = myArray[nextPos];
          myArray[nextPos] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {

     // bubble sort
     int[] input2 = {0,5,16,22,12,-5};
     System.out.println("Before bubble sort");
     printArray(input2);
     bubbleSort(input2);
     System.out.println("After bubble sort");
     printArray(input2);
  }


}