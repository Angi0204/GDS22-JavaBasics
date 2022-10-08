public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] values1 = new int[3]; // values1_0, values1_1, values1_2
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;

        int[] values2 = {7, 5, 1};
        for (int i = 0; i < values1.length; i++) {
            System.out.println("i = " + i + ";values: " + values1[i]);
        }

        for (int i = 0; i < values2.length; i++) {
            System.out.println(" i= " + i + " ;value:" + values2[i]);
        }
        System.out.println(" Addition");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] + values2[i];
            System.out.print(result + ",");

        }
        System.out.println(" Multiplikation");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] * values2[i];
            System.out.print(result + ",");
        }

    }
}