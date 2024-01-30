/**
 * Program can run from Main. Everytime the program runs it will run both encode and decode function.
 * The encode function generate an encoded text with a random offset Character.
 * The decode function will decode the encoded text into plain text.
 */
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
