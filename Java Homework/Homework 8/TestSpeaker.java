import java.util.Scanner;
public class TestSpeaker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What grade are you going into: ");
        String nextGrade = scan.nextLine();

        Student testStudent = new Student();
        testStudent.speak();
        testStudent.announce(nextGrade);

        System.out.print("Is it a boy or a girl: ");
        String newChild = scan.nextLine();

        Father testFather = new Father();
        testFather.speak();
        testFather.announce(newChild);

        System.out.print("What subject do you teach: ");
        String classTaught = scan.nextLine();

        Teacher testTeacher = new Teacher();
        testTeacher.speak();
        testTeacher.announce(classTaught);
    }
    
}
