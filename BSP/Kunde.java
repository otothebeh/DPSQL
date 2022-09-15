public class Kunde implements java.io.Serializable {
    private String name;
    private String adresse;

    public Kunde() {
    }

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Kunde(Kunde other) {
        Kunde neu = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Kunde [adresse=" + adresse + ", name=" + name + "]";
    }

}
