class GradesTest {

  public static void main(String[] args) {

     int[] cs505grades = {90,80,70,100,75};

     Grades cs505 = new Grades(cs505grades);
  
     int high = cs505.highest();
     System.out.println("CS505 high value= " + high);

     int[] cs506grades = {80,90,95};
     Grades cs506 = new Grades();
     cs506.setValues(cs506grades);

     int h = cs506.highest();
     System.out.println("CS506 high value= " + h);

  }

}