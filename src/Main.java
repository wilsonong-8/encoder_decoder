import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        String result = encoder.encode("AAA BBB");
        System.out.println(result);

    }
}
