package textSplit;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by Elatha on 09/07/2017.
 */
public class TextSplit_v3 {

    public static void main(String[] args) {

        valueOfCharacter("a"); //1
        valueOfCharacter("A"); //1.5
        valueOfCharacter("M"); //2
        valueOfCharacter("f"); //0.5

        String text = "The ability to write good code differentiates good developers from the rest";
        int lineas = 3;

        List<String> textoDivididoByWords = splitTextInLines(text,lineas);

        System.out.println("------------- Words -------------");
        for(int i=0;i<textoDivididoByWords.size();i++){
            System.out.println(textoDivididoByWords.get(i));
        }


    }


    public static List<String> splitTextInLines(String text, int lineas) {

        List<String> frases = new ArrayList<>();
        List<String> palabras = new ArrayList<>(Arrays.asList(text.split(" ")));

        int numeroPalabras = palabras.size();

        ArrayList<Double> pesos = pesosString(palabras);
        double pesoTotal = pesoString(text);
        System.out.println("El peso total es de: " + pesoTotal);

        double pesoLinea = pesoTotal / lineas;
        System.out.println("Cada linea tiene que tener un peso de: " + pesoLinea);


        double pesoParcial = 0;
        String lineaActual = "";
        for (int i = 0; i < numeroPalabras; i++) {

            String palabra = palabras.get(0);
            palabras.remove(0);

            if ( (pesoString(palabra) + pesoParcial) < pesoLinea ) {
                lineaActual += palabra + " ";
                pesoParcial += pesoString(lineaActual);
                System.out.println(pesoString(lineaActual) + " / " + lineaActual);
            } else {
                frases.add(lineaActual);
                System.out.println(lineaActual);
                lineaActual = "";
                pesoParcial = 0;
            }



        }



        return frases;

    }

    public static String lineaTexto(List<String> palabras, double pesoMaximo) {

        String textoResultado = "";






        return textoResultado;
    }


    public static ArrayList<Double> pesosString(List<String> palabras){

        ArrayList<Double> pesos = new ArrayList<>();

        for ( String palabra:palabras ) {
            double pesoPalabra = pesoString(palabra);
            pesos.add(pesoPalabra);
        }

        return pesos;
    }


    public static double pesoString(String palabra) {

        double peso = 0;

        String[] letras = palabra.split("");
        for (String letra:letras ) {
            peso += valueOfCharacter(letra);
        }

        return peso;
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
    public static double valueOfCharacter(String character) {

        String one = "abcdeghknopqrsuvxyz I023456789¿?";
        String oneAndHalf = "ABCDEFGHJKLNOPQRSTUVXYZmw$%&-";
        String two = "MW";
        // All other characters have a half off value

        if ( one.contains(character) ) {
//            System.out.println("El valor del char " + character + " es 1");
            return 1;
        } else if ( oneAndHalf.contains(character) ){
//            System.out.println("El valor del char " + character + " es 1.5");
            return 1.5;
        } else if ( two.contains(character) ){
//            System.out.println("El valor del char " + character + " es 2");
            return 2;
        } else {
//            System.out.println("El valor del char " + character + " es 0.5");
            return 0.5;
        }


    }

}
