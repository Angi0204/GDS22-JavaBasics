public class Tagesabschnitt {

    public static void main(String[] args) {
        // Variable in der Main lassen,wenn ich weiterrechnen will
        byte hour=12;
        String abschnitt ="";

        System.out.println(GetDayTimename((byte)6));
    }
    //public static return_type
    public static String GetDayTimename (byte time) {
        String abschnitt="";
        if (time < 6 || time >= 20) {
            abschnitt = "Nacht";
        } else if (time < 9) {
            abschnitt = "Früh";
        } else if (time < 12) {
            abschnitt = "Vormittag";
        } else if (time < 16) {
            abschnitt = "Nachmittag";
        } else {
            abschnitt = "Abend";
        } return abschnitt;
    }

}




