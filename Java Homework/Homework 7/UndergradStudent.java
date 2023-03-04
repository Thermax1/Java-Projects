class UndergradStudent extends Student {

	public UndergradStudent(int myId,  int midExam,  int finExam) {
	
		super(myId, midExam, finExam);
	}
	
	@Override
	public char getLetterGrade() {
	
		char letterGrade = ' ';
		
		double average = calcAvg();
		
		if(average >= 90)
			letterGrade = 'A';
		else if(average >= 80)
			letterGrade = 'B';
		else if(average >= 70)
			letterGrade = 'C';
		else if(average >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;
	}
}
