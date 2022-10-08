public class Schleifen {
    public static void main(String[] args) {

        int a = 1;
        int next= a+a++;
        int sum=a+next;
        while (a >=1 && a <= 100) {
            System.out.println("a = " + sum);
            return;
        }

    }
}