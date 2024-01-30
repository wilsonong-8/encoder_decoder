import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        String result = encoder.encode("HELLO WORLD");
        String decodedText = encoder.decode(result);

        System.out.println(result);
        System.out.println(decodedText);

    }
}
