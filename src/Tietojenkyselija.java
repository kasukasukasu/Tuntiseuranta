import java.sql.Date;

public class Tietojenkyselija {

    private Date pvm;
    private int tunnit;
    private String tehtävänkuvaus;
    private String onkoLaskutettava;


    public Tietojenkyselija(Date pvm, int tunnit, String tehtävänkuvaus, String onkoLaskutettava) {
        this.pvm=pvm;
        this.tunnit=tunnit;
        this.tehtävänkuvaus=tehtävänkuvaus;
        this.onkoLaskutettava=onkoLaskutettava;
    }

    public Date getPvm() {
        return pvm;
    }

    public void setPvm(Date pvm) {
        this.pvm=pvm;
    }

    public int getTunnit() {
        return tunnit;
    }

    public void setTunnit(int tunnit) {
        this.tunnit=tunnit;
    }

    public String getTehtävänkuvaus() {
        return tehtävänkuvaus;
    }

    public void setTehtävänkuvaus(String tehtävänkuvaus) {
        this.tehtävänkuvaus=tehtävänkuvaus;
    }

    public String getOnkoLaskutettava() {
        return onkoLaskutettava;
    }

    public void setOnkoLaskutettava(String onkoLaskutettava) {
        this.onkoLaskutettava=onkoLaskutettava;
    }


    @Override
    public String toString() {
        return "Tietojenkyselija{" +
                "pvm=" + pvm +
                ", tunnit=" + tunnit +
                ", tehtävänkuvaus='" + tehtävänkuvaus + '\'' +
                ", onkoLaskutettava='" + onkoLaskutettava + '\'' +
                '}';
    }
}


