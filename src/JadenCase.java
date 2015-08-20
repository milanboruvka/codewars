import java.util.Arrays;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || "".equals(phrase)) {
            return null;
        }
        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<words.length; i++) {
            char[] chars = words[i].toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            sb.append(String.valueOf(chars));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}