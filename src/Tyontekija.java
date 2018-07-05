import java.sql.ResultSet;

public class Tyontekija {


    private int id;
    private String nimi;
    private String osasto;
    private String tehtavanimike;



    public Tyontekija(int id, String nimi, String osasto, String tehtavanimike) {
        this.id=id;
        this.nimi=nimi;
        this.osasto=osasto;
        this.tehtavanimike=tehtavanimike;
    }

    public Tyontekija(ResultSet rs) {
        this.id = id;
    }

    public int getKäyttäjäid() {
        return id;
    }

    public void setKäyttäjäid(int käyttäjäid) {
        this.id=id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi=nimi;
    }

    public String getOsasto() {
        return osasto;
    }

    public void setOsasto(String osasto) {
        this.osasto=osasto;
    }

    public String getTehtävänimike() {
        return tehtavanimike;
    }

    public void setTehtävänimike(String tehtävänimike) {
        this.tehtavanimike=tehtävänimike;
    }


    @Override
    public String toString() {
        return "Tyontekija{" +
                "käyttäjäid=" + id +
                ", nimi='" + nimi + '\'' +
                ", osasto='" + osasto + '\'' +
                ", tehtävänimike='" + tehtavanimike + '\'' +
                '}';
    }

}