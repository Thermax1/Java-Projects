class Grades {

  private int[] values;

  Grades () {
    System.out.println("In constructor:  Grades()");
    this.values = null;
  };
  Grades (int[] values) {
    System.out.println("In constructor:  Grades(int[] values)");
    this.values = values;
  };
  public void setValues(int[] myArray) { 
    values = myArray;
  };
  
  public int highest() {
    int high;
    high = values[0];

    for (int i=0; i<values.length; i++)
       if (high < values[i])
         high = values[i];

    return high;
  }

}