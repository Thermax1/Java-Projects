public class Teacher implements Speaker{
    @Override
    public void speak() {
        System.out.println("I am currently a teacher.");
    }

    @Override
    public void announce(String classTaught) {
        System.out.println("I am currently teaching " + classTaught + "!");
    }
}
