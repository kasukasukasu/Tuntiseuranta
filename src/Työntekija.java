public class Työntekija {


    private int käyttäjäid;
    private String nimi;
    private String osasto;
    private String tehtävänimike;



    public Työntekija(int käyttäjäid, String nimi, String osasto, String tehtävänimike) {
        this.käyttäjäid=käyttäjäid;
        this.nimi=nimi;
        this.osasto=osasto;
        this.tehtävänimike=tehtävänimike;
    }

    public int getKäyttäjäid() {
        return käyttäjäid;
    }

    public void setKäyttäjäid(int käyttäjäid) {
        this.käyttäjäid=käyttäjäid;
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
        return tehtävänimike;
    }

    public void setTehtävänimike(String tehtävänimike) {
        this.tehtävänimike=tehtävänimike;
    }


    @Override
    public String toString() {
        return "Työntekija{" +
                "käyttäjäid=" + käyttäjäid +
                ", nimi='" + nimi + '\'' +
                ", osasto='" + osasto + '\'' +
                ", tehtävänimike='" + tehtävänimike + '\'' +
                '}';
    }

}