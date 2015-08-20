/*

254 shades of grey

Why would we want to stop to only 50 shades of grey? Let's see to how many we can go.

Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal
code (#aaaaaa for example). The array should be sorted in ascending order starting with #010101, #020202, etc.
(using lower case letters).

As a reminder, the grey color is composed by the same number of red, green and blue: #010101, #aeaeae, #555555, etc.
Also, #000000 and #ffffff are not accepted values.

When n is negative, just return an empty array. If n is higher than 254, just return an array of 254 elements.

*/

import java.util.Arrays;

public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {
        // returns n shades of grey in an array
        if (num <= 0) {
            return new String[0];
        }
        if (num > 254) {
            num = 254;
        }

        String[] greys = new String[num];

        int i=0;
        while (i<num) {
            i++;
            String s = Integer.toHexString(i);
            if (s.length() == 1) {
                s = "0" + s;
            }
            greys[i-1] = "#" + s + s + s;
        }
        return greys;
    }

    public static void main(String[] args) {
        String[] shadesOfGrey = ShadesOfGrey.shadesOfGrey(10);
        System.out.println(Arrays.asList(shadesOfGrey));

        shadesOfGrey = ShadesOfGrey.shadesOfGrey(-1);
        System.out.println(Arrays.asList(shadesOfGrey));

        shadesOfGrey = ShadesOfGrey.shadesOfGrey(0);
        System.out.println(Arrays.asList(shadesOfGrey));

        shadesOfGrey = ShadesOfGrey.shadesOfGrey(1);
        System.out.println(Arrays.asList(shadesOfGrey));

        shadesOfGrey = ShadesOfGrey.shadesOfGrey(150);
        System.out.println(Arrays.asList(shadesOfGrey));

        shadesOfGrey = ShadesOfGrey.shadesOfGrey(300);
        System.out.println(Arrays.asList(shadesOfGrey));
    }
}