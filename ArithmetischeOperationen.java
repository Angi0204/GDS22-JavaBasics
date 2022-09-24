import java.sql.SQLOutput;

public class ArithmetischeOperationen {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int result;

        // addieren
        result = a + b;
        System.out.println("result = " + result);

        // subtrahieren
        result = b - a;
        System.out.println("result = " + result);

        //multiplizieren - bei dieser Methode kann man nicht weiterrechnen
        System.out.println("Multiplizieren: " + (a * b));

        //Division
        double div = (double) a / (double) b;
        System.out.println("dividieren double = " + div);

        //Restwert- Modulo
        result = a % b;
        System.out.println("result = " + result);


        //a++ öfters verwendet  => a= a+1
        System.out.println("a++");

        //Hier erwarte mir 3, wurde nicht erhöht weil nicht ausgegeben
        System.out.println(a++); //---> zuerst "definiert"

        //hier wurde a ausgewerdet und jetzt wird sie um eins vermehrt
        System.out.println("a= " + a ); // ich erwarte mir 4

        //++b
        System.out.println("++b");

        System.out.println(++b);

        System.out.println("b= "+ b);
    }
}
