public class KataMissingLetter {


    public static char findMissingLetter(char[] array) {
        for (int i=1; i<array.length; i++) {
            int x = Character.compare(array[i], array[i-1]);
            if (x != 1) {
                return (char) (array[i]-1);
            }
        }
        return 0;
    }

}
