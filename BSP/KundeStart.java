import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class KundeStart {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Kunde k1 = new Kunde("Domenic", "Sesstrasse 7");
        Kunde k2 = new Kunde("Max", "Sosstrasse 5");

        ArrayList<Kunde> list = new ArrayList<Kunde>();

        list.add(k1);
        list.add(k2);
        list.add(k2);

        FileOutputStream fos = new FileOutputStream("kunden.dat");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(list);

        os.close();

        FileInputStream fis = new FileInputStream("kunden.dat");
        ObjectInputStream is = new ObjectInputStream(fis);

        ArrayList<Kunde> list2 = (ArrayList<Kunde>) is.readObject();

        for (Kunde k : list2) {

            System.out.println(k.toString());
        }

        if (list2.get(1) == list2.get(2)) {

            System.out.println("sind identisch");
        } else {
            System.out.println("sind verschieden");
        }

        is.close();

    }
}