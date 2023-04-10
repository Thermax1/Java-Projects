class Student {
   private int id;
   private int midtermExam;
   private int finalExam;

   Student() {
   }

   Student(int myId,  int midExam,  int finExam) {
   
   id = myId;
   midtermExam = midExam;
   finalExam = finExam;
   }

   public double calcAvg() {
      double avg;
      avg = (midtermExam + finalExam) / 2.0;
      return avg;
   }

   public char getLetterGrade() {
      char letterGrade = ' ';

      return letterGrade;
   }
}
