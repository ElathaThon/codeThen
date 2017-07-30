package car;

/**
 * Created by elatha on 29/7/17.
 */

/** A car that can accelerate and brake
 *
 * 1- Probar cosas como:
 *  El coche al principio está a velocidad 0.
 *  Acelerar una vez.
 *  Acelerar varias veces.
 *  Acelerar y frenar.
 *
 *  2- Podéis mejorar la clase evitando que el coche quede a velocidad negativa o se pase de su máximo. Para evitar excepciones de momento, simplemente haced
 *  que el coche no pueda pasar de estos límites por más que aceleres o frenes.
 *
 *  3- Probar este nuevo comportamiento en CarTest:
 *  Intentar acelerar el coche a más de su maxSpeed (currentSpeed será igual a maxSpeed).
 *  Frenar más de lo necesario (la currentSpeed debería ser 0).
 *
 *
 * */

public class Car {

    // Fields

    private String brand;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String brand, int maxSpeed) {

        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Max speed must be positive");
        }

        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    // Methods

    void accelerate(int amount) {

        if (this.currentSpeed + amount > this.maxSpeed){
            this.currentSpeed = this.maxSpeed;
        } else {
            this.currentSpeed += amount;
        }

    }

    void brake(int amount) {

        if (this.currentSpeed - amount < 0){
            this.currentSpeed = 0;
        } else {
            this.currentSpeed -= amount;
        }

    }

    // Getters (we don’t need setters now)

    public String getBrand() {
        return this.brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
}

