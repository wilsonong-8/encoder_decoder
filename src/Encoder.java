public class Encoder {


    private KeyTable keyTable;

    public  final String ENCODE = "encode";
    public  final String DECODE = "decode";

    public Encoder() {
        keyTable = new KeyTable();
    }

    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder();

//        int offsetNum = (int) (Math.random()*44);
        int offsetNum = 1;
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
        return "Decoded Text";
    }

    public char convertCharByOffsetValue(char c,int offsetValue,String function) {
        int initialValue = keyTable.convertCharToInt(c);
        char convertedChar = 0;
        if(function == ENCODE){
            if(initialValue < 0) {
                return c;
            }
            int finalValue = initialValue - offsetValue;
            if(finalValue < 0 ) {
                finalValue = (initialValue - offsetValue) + 44;
            }
            convertedChar = keyTable.convertIntToChar(finalValue);
        }
        else if(function == DECODE) {

        }
        return convertedChar;
    }
}
