import java.sql.ResultSet;
import java.sql.SQLException;

public class Tyopanos {
    private int id;
    private int kayttajaid;
    private int pvm;
    private double tunnit;
    private String tehtävänkuvaus;
    private boolean onkoLaskutettava;
    private Tyontekija tyontekija;


    public Tyopanos(int pvm, double tunnit, String tehtävänkuvaus, boolean onkoLaskutettava) {
        this.kayttajaid = id;
        this.pvm=pvm;
        this.tunnit=tunnit;
        this.tehtävänkuvaus=tehtävänkuvaus;
        this.onkoLaskutettava=onkoLaskutettava;
    }

    public Tyopanos(ResultSet rs) throws SQLException {
        this.id = id;
        this.kayttajaid = rs.getInt("kayttajaid");
        this.pvm = rs.getInt("pvm");
        this.tunnit = rs.getDouble("tunnit");
        this.tehtävänkuvaus = rs.getString("tehtava");
        this.onkoLaskutettava = rs.getBoolean("laskutettava");
    }

    public Tyontekija getTyontekija() {
        return tyontekija;
    }

    public void setTyontekija(Tyontekija tyontekija) {
        this.tyontekija = tyontekija;
    }

    public int getPvm() {
        return pvm;
    }

    public void setPvm(int pvm) {
        this.pvm=pvm;
    }

    public double getTunnit() {
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

    public boolean getOnkoLaskutettava() {
        return onkoLaskutettava;
    }

    public void setOnkoLaskutettava(boolean onkoLaskutettava) {
        this.onkoLaskutettava=onkoLaskutettava;
    }


    @Override
    public String toString() {
        return "Työpanos{" +
                "pvm=" + pvm +
                ", tunnit=" + tunnit +
                ", tehtävänkuvaus='" + tehtävänkuvaus + '\'' +
                ", onkoLaskutettava='" + onkoLaskutettava + '\'' +
                '}';
    }
}
