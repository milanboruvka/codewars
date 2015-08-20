import java.util.*;
//import java.util.stream.*;

public class Backronym {


    private static Map<String, String> dictionary = Preload.dictionary;

    public static String makeBackronym(String acronym) {
        String ret = "";
        char[] chars = acronym.toCharArray();
        for (int i=0; i<chars.length; i++) {
            String s = dictionary.get(String.valueOf(((char)chars[i])).toUpperCase());
            ret = ret + s + " ";
        }
        return ret.trim();
    }
}

