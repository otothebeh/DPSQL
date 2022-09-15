import java.io.Serializable;
import java.lang.reflect.Type;

public class Kunde implements Serializable {
    private String  name,
                    addresse;

    public Kunde()
    {

    }
    public Kunde(Kunde customer)
    {
        this.name = customer.getName();
        this.addresse = customer.getAddresse();
    }
    public  Kunde(String name, String addresse)
    {
        this.name = name;
        this.addresse = addresse;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getName() {
        return name;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(Kunde.class)
                    ? this.name.equals(((Kunde)obj).name) &&
                        this.addresse.equals(((Kunde)obj).addresse)
                    : super.equals(obj);
    }
}
