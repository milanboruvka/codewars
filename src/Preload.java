import java.util.HashMap;
import java.util.Map;

public class Preload {

    public static Map<String, String> dictionary = new HashMap<String, String>();

    static {
        dictionary.put("I", "ingestable");
        dictionary.put("N", "newtonian");
        dictionary.put("T", "turn");
        dictionary.put("E", "eager");
        dictionary.put("R", "rant");
        dictionary.put("S", "stylish");
        dictionary.put("G", "gregarious");
        dictionary.put("C", "confident");
        dictionary.put("O", "oscillating");
        dictionary.put("D", "disturbing");
        dictionary.put("W", "weird");
        dictionary.put("A", "awesome");
    }

}