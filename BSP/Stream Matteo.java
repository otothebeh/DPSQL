package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Launcher {

    public static void main(String[] args) throws IOException {

        File f1 = new File("src/Stream/history.txt");
        f1.createNewFile();
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("Call History:");
        Calendar c = new GregorianCalendar();
        pw.write(" Call by " + args[0] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.write(" Call by " + args[1] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.write(" Call by " + args[2] + " at local time: " + c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        pw.close();
    }
}
