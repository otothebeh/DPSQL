package File_and_DateTime;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        File f1 = new File(args[0]);
        long lastModified = f1.lastModified();
        Date date = new Date(lastModified);
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Letzte Änderung: " + sdf2.format(new Date(c.getTimeInMillis())));
        System.out.println(sdf1.format(new Date(c.getTimeInMillis())));
        System.out.println(c.get(Calendar.DAY_OF_MONTH) + " " + c.get(Calendar.MONTH) + " " // Keine Ahnung, wieso der bei Month 5 anstatt 6 für Juni ausgibt
                + c.get(Calendar.YEAR));

    }
}
