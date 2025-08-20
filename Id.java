import java.util.concurrent.ThreadLocalRandom;

public class Id {
    public static int gerarId() {
        return ThreadLocalRandom.current().nextInt(1000, 10000);
    }
}

