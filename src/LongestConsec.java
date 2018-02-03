class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        String ret = "";
        if (k > strarr.length || k <= 0) {
            return ret;
        }
        for (int i=0; i<strarr.length; i++) {
            String tmpString = getString(strarr, i, k);
            if (tmpString.length() > ret.length()) {
                ret = tmpString;
            }
        }
        return ret;
    }

    private static String getString(String[] arr, int startIndex, int count) {
        StringBuilder sb = new StringBuilder("");
        for (int i=startIndex; count>0 && i<arr.length; i++, count--) {
            sb.append(arr[i]);

        }
        return sb.toString();
    }

}