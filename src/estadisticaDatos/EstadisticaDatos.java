package estadisticaDatos;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Created by elatha on 12/7/17.
 */
public class EstadisticaDatos {


    public static void main(String[] args) {

        ArrayList<Double> numeros = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime numeros, quando acabes esribe 'ok'. Los decimales usando el punto (.)");

        while (scanner.hasNextDouble()) {
            double i = scanner.nextInt();
            numeros.add(i);
        }
        scanner.close();


        printLista(numeros);


        System.out.println("El valor maxim es: " + maxValue(numeros));
        System.out.println("El valor minim es: " + minValue(numeros));
        System.out.println("La suma  es: " + suma(numeros));
        System.out.println("La media  es: " + mediaAritmetica(numeros));
        System.out.println("La mediana  es: " + mediana(numeros));

        System.out.println("**La moda es: " + moda(numeros) + "**");








    }

    public static double moda(ArrayList<Double> numeros) {


        double moda = 0;

        Collections.sort(numeros);
//
//        double[][] valorsNumeros = [numeros.size()][1];
//
//
//        for(int i=0;i<numeros.size();i++){
//            numeros.get(i);
//        }


        //System.out.println("La moda es: " + moda);
        return moda;

    }

    public static double mediana(ArrayList<Double> numeros) {

        Collections.sort(numeros);

        double mediana = 0;

        if (numeros.size() % 2 == 0 ) {
            //El numero de numeros a la llista es parell - dels dos del centre la meijana

            ArrayList<Double> numerosCentrals = new ArrayList<Double>();

            numerosCentrals.add(numeros.get(Math.round(numeros.size()/2)));
            numerosCentrals.add(numeros.get(Math.round(numeros.size()/2) + 1));

            mediana = mediaAritmetica(numerosCentrals);

        } else {
            //El numero de numeros a la llista es senar - afagem el del centre

            mediana = numeros.get( (int) Math.round(numeros.size()/2));
        }


        //System.out.println("La meidana es: " + mediana);
        return mediana;

    }

    public static double mediaAritmetica(ArrayList<Double> numeros){

        double media = suma(numeros) / numeros.size();

        //System.out.println("La media es: " + media);
        return media;

    }

    public static double suma(ArrayList<Double> numeros) {

        double total = 0;

        for(int i=0;i<numeros.size();i++){
            total += numeros.get(i);
        }

        //System.out.println("La suma es: " + total);
        return total;


    }

    public static double minValue(ArrayList<Double> numeros) {

        Double min = Collections.min(numeros);

        //System.out.println("El minim es: " + min);
        return min;

    }


    public static double maxValue(ArrayList<Double> numeros) {

        Double max = Collections.max(numeros);

        //System.out.println("El maxim es: " + max);
        return max;


    }



    public static void printLista(ArrayList<Double> numeros) {

        System.out.println("La lista de numeros es: ");

        for(int i=0;i<numeros.size();i++){
            System.out.print(numeros.get(i) + " ");
        }

        System.out.println("\n--");


    }

}
