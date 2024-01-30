public class Encoder {


    private KeyTable keyTable;

    private final String ENCODE = "encode";
    private final String DECODE = "decode";

    public Encoder() {
        keyTable = new KeyTable();
    }

    public String encode(String plainText) {
        plainText = plainText.toUpperCase();
        StringBuilder encodedText = new StringBuilder();

        int offsetNum = (int) (Math.random()*44);
//        int offsetNum = 10;
        char offsetChar = keyTable.convertIntToChar(offsetNum);
        encodedText.append(offsetChar);

        for(int i=0; i<plainText.length();i++) {
            char c = plainText.charAt(i);
            char cConverted = convertCharByOffsetValue(c,offsetNum,ENCODE);
            encodedText.append(cConverted);
        }
        return encodedText.toString();
    }

    public String decode(String plainText) {
        plainText = plainText.toUpperCase();
        StringBuilder decodedText = new StringBuilder();

        char offsetChar = plainText.charAt(0);
        int offsetNum = keyTable.convertCharToInt(offsetChar);

        for (int i = 1; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            char cConverted = convertCharByOffsetValue(c,offsetNum,DECODE);
            decodedText.append(cConverted);
        }
        return decodedText.toString();

    }

    public char convertCharByOffsetValue(char c,int offsetValue,String function) {
        int initialValue = keyTable.convertCharToInt(c);
        char convertedChar = 0;

        if(initialValue < 0) {
            return c;
        }

        if(function == ENCODE){
            int finalValue = initialValue - offsetValue;
            if(finalValue < 0 ) {
                finalValue = finalValue + 44;
            }
            convertedChar = keyTable.convertIntToChar(finalValue);
        }
        else if(function == DECODE) {
            int finalValue = initialValue + offsetValue;
            if(finalValue > 43) {
                finalValue = finalValue - 44;
            }
            convertedChar = keyTable.convertIntToChar(finalValue);
        }
        return convertedChar;
    }

    public String conversionToString(String plainText) {
        return "";
    }
}
