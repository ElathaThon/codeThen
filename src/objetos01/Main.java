package objetos01;

public class Main {

    public static void main(String[] args) {

        Radio radio1 = new Radio("Marca 1");
        Radio radio2 = new Radio("Marca 2");

        System.out.println(radio1.toString());
        radio1.encender();
        System.out.println(radio1.toString());

        radio2.encender();
        System.out.println(radio2.toString());
        radio2.bajarVoluen();
        radio2.bajarVoluen();
        System.out.println(radio2.toString());
        radio2.subirVolumen();
        System.out.println(radio2.toString());



    }

}