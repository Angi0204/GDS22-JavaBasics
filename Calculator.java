public class Calculator { // RUN LINKS!

    public static void main(String[] args) {

        double variableX = 2;
        double variableY = 4;

        double summeXY = variableX + variableY;
        String name = " Additions-Rechner!";

        System.out.println("Mein Name ist" + name);
        System.out.println("Das Ergebnis der Addition lautet " + summeXY + "!");
        // oder gleich in der Ausgabe addieren
        System.out.println(name + (summeXY));

        int ergebnis = add(1, 2);
        System.out.println("Ergebnis = " + ergebnis);

        int ergebnis1 = sub(1, 2);
        System.out.println("Ergebnis = " + ergebnis1);

        int ergebnis2 = mul(1, 2);
        System.out.println("Ergebnis = " + ergebnis2);

        int ergebnis3 = div(1, 2);
        System.out.println("Ergebnis = " + ergebnis3);


    }

    //Methoden:

    //
    public static int add(int input1, int input2) {
        int add = input1 + input2;
        return add;
    }

    public static int sub(int input1, int input2) {
        return input1 - input2;

    }

    public static int mul(int input1, int input2) {
        int mul = input1 * input2;
        return mul;

    }

    public static int div(int input1, int input2) {
        if (input2 == 0) {
            System.out.println("ERROR");
            return 0;
        }

        return input1 / input2;
    }

}