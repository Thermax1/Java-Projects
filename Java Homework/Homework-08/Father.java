public class Father implements Speaker{
    @Override
    public void speak() {
        System.out.println("I am a father of two boys!");
    }

    @Override
    public void announce(String newChild) {
        System.out.println("My next child is a " + newChild + "!");
    }
}
