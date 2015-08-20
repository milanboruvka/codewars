import java.util.StringTokenizer;

public class Kata {
    public static String HighAndLow(String numbers) {
        int min = 0;
        int max = 0;
        boolean unset = true;
        StringTokenizer stringTokenizer = new StringTokenizer(numbers, " ");

        while (stringTokenizer.hasMoreTokens()) {
            int i = Integer.valueOf((stringTokenizer.nextToken().toString()));
            System.out.println("i = " + i);
            if (unset) {
                min = i;
                max = i;
                unset = false;
            }
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max + " " + min;
    }
}