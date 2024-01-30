import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        String plainText = "HELLO # WORLD @789";
        String result = encoder.encode(plainText);
        String decodedText = encoder.decode(result);

        System.out.println("Plain Text: " + plainText);
        System.out.println("Encoded Text: " + result);
        System.out.println("Decoded Text: " + decodedText);

    }
}
