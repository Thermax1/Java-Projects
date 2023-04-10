public class Student implements Speaker{
    @Override
    public void speak() {
        System.out.println("I am a student.");
    }

    @Override
    public void announce(String nextGrade) {
        System.out.println("I am moving on to " + nextGrade + "!");
    }
}
