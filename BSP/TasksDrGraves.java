import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class Tasks
{
    public static void main (String[] args)
    {

        // Aufgabe 1
        var linkedList = new ListNode ("n1");

        for (int k = 2; k <= 5; k++)
            linkedList.append ("n" + k);
        System.out.println (linkedList.toString());

        System.out.println (ListNode.contains (linkedList,"n4"));

        // Aufgabe 2
        var path = "testfile.txt";
        try(var pw = new PrintWriter(new FileWriter(path)))
        {
            pw.println("Call History:");

            for (int k = 0; k < 6; k += 2)
                pw.println ((   " Call by " +
                                args[k] + " " +
                                args[k+1] +
                                " at local time: " +
                                LocalDateTime.now ()));
        }
        catch (IOException e) {
            throw new RuntimeException (e);
        }

        // Aufgabe aus letzer Stunde
        var pathToDirectory = "./subdirectory";
        var file = new File (pathToDirectory);
        file.mkdir ();

        var date = LocalDateTime.now ();
        var formatter = DateTimeFormatter.ofPattern ("");

        System.out.println (date.format (formatter));

        // Aufgabe 3

        var kundeArrayList = new ArrayList<> (3);
        kundeArrayList.add (new Kunde ("Albert","Einstein"));
        kundeArrayList.add (new Kunde ("Bernd","Zweistein"));

        // uneindeutig, weil Objekt != Instanz, wenn ein direkter Verweis gemeint ist:
        kundeArrayList.add (kundeArrayList.get (1));
        // sonst als neue Instzanz
        //kundeArrayList.add (new Kunde (kundeArrayList.get(1)));

        var filename = "Kunden.dat";


        try (var oos = new ObjectOutputStream (new FileOutputStream (filename)))
        {
            oos.writeObject (kundeArrayList);
            oos.flush ();

        } catch (IOException i) {
            i.printStackTrace ();
        }


        var result = new ArrayList<Kunde> (3);
        try (var ois = new ObjectInputStream (new FileInputStream (filename)))
        {
            result = (ArrayList<Kunde>) ois.readObject ();
        } catch (FileNotFoundException e) {
            throw new RuntimeException (e);
        }
        catch (IOException e) {
            throw new RuntimeException (e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException (e);
        }


        System.out.println (result.get (1).equals (kundeArrayList.get (2))
                                ?  "gleich"
                                : "ungleich");

        // Aufgabe 4




    }

    public static void bubbleSort (ArrayList<Comparable> list)
    {
        Comparable temp;

        if (list.size () > 1)
            for (int x=0; x < list.size (); x++) // Bubble Sort aeussere Schleife
                for (int i=0; i < list.size () - x - 1; i++) // Bubble Sort innere Schleife
                    if (list.get (i).compareTo (list.get (i + 1)) > 0)
                    {
                        temp = list.get (i);
                        list.set (i,list.get (i + 1));
                        list.set (i + 1, temp);
                    }




    }
}
