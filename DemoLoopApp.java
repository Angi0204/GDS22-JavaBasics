public class DemoLoopApp {
    public static void main(String[] args) {
        int vorgaenger = 0;
        int counter = 0;
        for (int i = 1; i < 100000; i++) {
            if ((i + vorgaenger) % 351 == 0) {
                System.out.println("Der Vorgänger von = " + i + " lautet " + vorgaenger);
                counter++;
                if (counter == 10) {
                    break;
                }
            } vorgaenger = i;

        }

    }
}
