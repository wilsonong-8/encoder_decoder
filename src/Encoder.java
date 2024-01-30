import java.util.Random;

public class Encoder {

    private KeyTable keyTable;

    public Encoder() {
        keyTable = new KeyTable();
    }

    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder();

        int offsetNum = (int)Math.random()*44;
        char offsetChar = keyTable.convertValueToChar(offsetNum);

        for(int i=0; i<plainText.length();i++) {
            char c = plainText.charAt(i);

        }
    }

    public String decode(String plainText) {

    }
}
