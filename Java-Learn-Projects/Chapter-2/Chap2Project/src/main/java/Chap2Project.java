public class Chap2Project {

    public static void main(String[] args) {
        String dinoBreed = "Stegosaurus";
        int dinoWeight = 14_000;
        String dinoName = "Jerry";
        int dinoAge = 3;
        String dinoDiet = "herbivore";
        String dinoInfo = String.format("This is %s, a %d year old %s. He is an %s, meaning he only eat plants. However, that doesn't stop him from weighing a staggering %d pounds!", dinoName, dinoAge, dinoBreed, dinoDiet, dinoWeight);

        System.out.println(dinoInfo);

    }
}
