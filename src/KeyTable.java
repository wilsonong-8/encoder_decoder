import java.util.HashMap;
import java.util.Map;

public class KeyTable {
    private char[] keyTable = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','(',')','*','+',',','-','.','/'};
    private Map<Character,Integer> letterTable;

    protected KeyTable() {
        letterTable = new HashMap<>();
        for (int i = 0; i < keyTable.length; i++) {
            letterTable.put(keyTable[i],i);
        }

    }

    protected char convertIntToChar(int value) {
        return keyTable[value];
    }

    protected int convertCharToInt(Character c) {
        return letterTable.getOrDefault(c,-1);
    }

}
