package car;

/**
 * Created by elatha on 29/7/17.
 */
public class CarTest {

    public static void main(String[] args) {

        newCar();
        accelerateSeveralTimes();
        accelerateAndBrake();

    }

    /** Test of sample program */

    /** El coche al principio está a velocidad 0. */
    public static void newCar(){

        Car ferrari = new Car("ferrari",450);

        assertEquals(ferrari.getCurrentSpeed(), 0);


    }

    /** Acelerar una vez. */
    public static void accelerateOneTime(){

        Car ferrari = new Car("ferrari",450);
        ferrari.accelerate(150);

        assertEquals(ferrari.getCurrentSpeed(), 150);


    }

    /** Acelerar varias veces. */
    public static void accelerateSeveralTimes(){

        Car ferrari = new Car("ferrari",450);
        ferrari.accelerate(50);
        ferrari.accelerate(25);
        ferrari.accelerate(10);
        ferrari.accelerate(40);
        ferrari.accelerate(30);
        ferrari.accelerate(100);
        ferrari.accelerate(35);

        assertEquals(ferrari.getCurrentSpeed(), 290);


    }

    /** Acelerar y frenar. */
    public static void accelerateAndBrake(){

        Car ferrari = new Car("ferrari",450);
        ferrari.accelerate(150);
        ferrari.brake(40);

        assertEquals(ferrari.getCurrentSpeed(), 110);


    }


    /** Throws an exception if the values are not equal */
    static void assertEquals(Object actual, Object expected) {
        if ( ! actual.equals(expected) ) {
            throw new RuntimeException("the actual value " + actual
                    + " is not equal to the expected " + expected);
        }
    }


}
