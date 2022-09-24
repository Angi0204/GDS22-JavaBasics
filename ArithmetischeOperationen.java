public class ArithmetischeOperationen {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
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



    }
}
