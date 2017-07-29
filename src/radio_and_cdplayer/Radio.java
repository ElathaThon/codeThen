package radio_and_cdplayer;

/**
 * 1- Cread una clase Radio con propiedades brand, volume y on (encendida o no).
 * Pensad constructor, getters, setters y demás métodos que creáis interesante poner.
 * */

public class Radio {

   private String brand;
   private int volume;
   private boolean power;

    public Radio(String brand){

        this.brand = brand;
        this.volume = 0;
        this.power = false;

    }

    @Override
    public String toString() {
        String text = "La radio " + this.brand + ", esta ";
        if (power) {
            text += "encendida";
        } else {
            text += "apagada";
        }
        text += " y tiene el volumen a " + volume;
        return text;
    }

    public String getBrand() {
        return this.brand;
    }

   public void encender(){
        if (power){
            System.out.println("La radio ya esta encendida!");
        } else {
            this.power = true;
            System.out.println("Se ha encendido la radio :)");
        }
   }

    public void apagar(){
        if (power){
            System.out.println("La radio ya esta apagada!");
        } else {
            this.power = true;
            System.out.println("Se ha apagado la radio :(");
        }
    }

    public void subirVolumen(){
        if (power) {
            this.volume++;
        } else {
            System.out.println("La radio esta apagada, hay que encenderla primero!");
        }
    }

    public void bajarVoluen(){
        if (power){
            if ((this.volume - 1) >= 0 ) {
                this.volume--;
            }
        } else {
            System.out.println("La radio esta apagada, hay que encederla primero!");
        }
    }

}
