import java.math.BigInteger;

/*

In this kata, you must create a function powers that takes an array, and returns the number of subsets possible to create from that list.
In other words, counts the power sets.

For instance

powers([1,2,3]) =&gt; 8
...due to...

powerSet([1,2,3]) =&gt;
[[],
 [1],
 [2],
 [3],
 [1,2],
 [2,3],
 [1,3],
 [1,2,3]]
Your function should be able to count sets up to the size of 500, so watch out; pretty big numbers occur there!
For comparison, my Haskell solution can compute the number of sets for an array of length 90 000 in less than a second, so be quick!
You should treat each array passed as a set of unique values for this kata.

Examples:

Powers.powers(new int[]{});        // 1
Powers.powers(new int[]{1});       // 2
Powers.powers(new int[]{1,2});     // 4
[[],            ... 1   (kdyz delka pole je nula, tak je to 1 moznost)
 [1],           ... 2   (kdyz delka pole je jedna, tak je to pocet prvku puvodniho pole)
 [2],           ....
 [1,2]]         ... 1  (kdyz delka pole je stejna jako delka vstupniho pole, je to 1

Powers.powers(new int[]{1,2,3,4}); // 16
[[],                1
 [1],               4
 [2],
 ...
 [4],

 [1,2]              6               mam 4 prvky a potrebuju kombinace po dvou       C(4,2) = 4 x 2 / 2! =§
 [1,3]                              https://cs.wikipedia.org/wiki/Kombinatorika#.C3.9Alohy_klasick.C3.A9_kombinatoriky
 [1,4]
 [2,3]
 [2,4]
 [3,4]
 ...
 [1,2,3]            4
 [2,3,4]
 [1,3,4]
 [1,2,4]
 ...
 [1,2,3,4]          1
Inspired by this kata by xcuthulu - refer to it if you're stuck!

Length = 3
    for
        i == 0 ... 1
        i == 1 ... 3 because I have 3 different items in list
        i == 2 ...
        i == 3 ... 1 because lenght is same
 */
public class Powers {


    public static BigInteger powers(int[] list) {
        return BigInteger.valueOf(2L).pow(list.length);
    }

    /* WORKS OK BUT OVERENGINEERED :D
    public static BigInteger powers(int[] list) {

        BigInteger sum = BigInteger.ZERO;
        BigInteger addon;

        for (int i=0; i<=list.length; i++) {
            if (i == 0) {
                addon = BigInteger.ONE;
            } else if (i == 1) {
                addon = BigInteger.valueOf(list.length);
            } else if (i == list.length) {
                addon = BigInteger.ONE;
            } else {
                addon = getNumberOfCombinations(list.length, i);
            }
            sum = sum.add(addon);
        }
        return sum;
    }

    private static BigInteger getNumberOfCombinations(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    public static BigInteger factorial(int i) {
        if (i == 0) {
            return BigInteger.ONE;
        } else {
            BigInteger ret = BigInteger.ONE;
            while (i>1) {
                ret = BigInteger.valueOf(i).multiply(ret);
                i--;
            }
            return ret;
        }
    }
    */

}
