import java.util.Random;
import java.util.Random;
public class Player {
    int number;

    int guess() {
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }
}
