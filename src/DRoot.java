public class DRoot {

    public static int digital_root(int n) {
        char[] characters = Integer.toString(n).toCharArray();
        int sum = 0;
        for (char character : characters) {
            int x = Integer.parseInt(Character.toString(character));
            sum += x;
        }
        if (sum > 10) {
            return digital_root(sum);
        } else {
            return sum;
        }
    }

}