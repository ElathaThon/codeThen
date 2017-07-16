package textSplit;

import java.util.*;

/**
 * From a text and a number of lines, we have to divide it into same width. We have a table of weights for the characters.
 *
 * http://www.kuediting.com/headlines/count/
 *
 *
 *
 * */

public class TextSplit {


    public static void main(String[] args) {

        valueOfCharacter("a");
        valueOfCharacter("M");



    }

    /**
     * Whight of each character according to the table:
     *
     * A count of 1
     * most lowercase letters (except f, i, l, t, j, m, w)
     * capital I
     * all numerals except 1
     * question marks
     * spaces between words
     *
     * A count of 1½
     * most capital letters (except M, W and I)
     * lowercase m and w
     * $, %, & and the dash
     *
     * A count of 2
     * capital M and W
     *
     * A count of ½
     * commas, periods and other punctuation not noted above
     * the numeral 1
     * lowercase letters f, i, l, t and j
     *
     * */
    public static int valueOfCharacter(String character) {

        String one = "abcdeghknopqrsuvxyz I023456789¿?";
        String oneAndHalf = "ABCDEFGHJKLNOPQRSTUVXYZmw$%&-";
        String two = "MW";
        //All other characters have a half off value

        if ( one.indexOf(character) >= 0 ) {
            System.out.println("El valor del char " + character + " es 1");
            return 1;
        } else {
            return 2;
        }


    }

}
