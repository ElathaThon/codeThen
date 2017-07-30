package generalThings;

/**
 * Created by elatha on 30/7/17.
 */
public class TestFunction {

    public static void main(String[] args) {



    }



    /** Throws an exception if the values are not equal */
    static void assertEquals(Object actual, Object expected) {
        if ( ! actual.equals(expected) ) {
            throw new RuntimeException("the actual value " + actual
                    + " is not equal to the expected " + expected);
        }
    }


}
