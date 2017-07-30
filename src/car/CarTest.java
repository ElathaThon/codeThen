package car;

/**
 * Created by elatha on 29/7/17.
 */
public class CarTest {

    public static void main(String[] args) {

        newCar();
        accelerateSeveralTimes();
        accelerateAndBrake();

        overAccelerate();
        overBrake();

    }

    /** Test of sample program */


    /** Aunque acelere mas de su velocidad maxima se quedara en la velocidad maxima */
    public static void overAccelerate(){

        Car ferrari = new Car("ferrari", 450);
        ferrari.accelerate(500);
        assertEquals(ferrari.getCurrentSpeed(), 450);

        Car honda = new Car("honda", 300);
        honda.accelerate(100);
        honda.accelerate(100);
        honda.accelerate(100);
        assertEquals(honda.getCurrentSpeed(), 300);

        honda.accelerate(1);
        assertEquals(honda.getCurrentSpeed(), 300);

    }

    /** Aunque frene mas de lo necesario, la velocidad sera cero y nunca negativa */
    public static void overBrake(){

        Car ferrari = new Car("ferrari", 450);
        ferrari.accelerate(300);
        ferrari.brake(400);
        assertEquals(ferrari.getCurrentSpeed(), 0);

        Car honda = new Car("honda", 300);
        honda.accelerate(100);
        honda.brake(50);
        honda.brake(50);
        assertEquals(honda.getCurrentSpeed(), 0);

        honda.brake(1);
        assertEquals(honda.getCurrentSpeed(), 0);

    }


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
