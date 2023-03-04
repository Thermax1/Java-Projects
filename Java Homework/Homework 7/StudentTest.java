class StudentTest {
	public static void main (String[] args) {
	
	Student Under1 = new UndergradStudent(1, 95, 100);
	
	System.out.println("Under1's average: " + Under1.calcAvg());
	System.out.println("Under1's grade: " + Under1.getLetterGrade());
	
	
	Student Under2 = new UndergradStudent(1, 78, 59);
	
	System.out.println("Under2's average: " + Under2.calcAvg());
	System.out.println("Under2's grade: " + Under2.getLetterGrade());
	
	Student Grad1 = new GraduateStudent(1, 85, 80);
	
	System.out.println("Grad1's average: " + Grad1.calcAvg());
	System.out.println("Grad1's grade: " + Grad1.getLetterGrade());
	
	
	Student Grad2 = new GraduateStudent(1, 78, 59);
	
	System.out.println("Grad2's average: " + Grad2.calcAvg());
	System.out.println("Grad2's grade: " + Grad2.getLetterGrade());
	}
}
