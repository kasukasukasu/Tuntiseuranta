public class Tyopanos {
    private int pvm;
    private int tunnit;
    private String tehtävänkuvaus;
    private String onkoLaskutettava;


    public Tyopanos(int pvm, int tunnit, String tehtävänkuvaus, String onkoLaskutettava) {
        this.pvm=pvm;
        this.tunnit=tunnit;
        this.tehtävänkuvaus=tehtävänkuvaus;
        this.onkoLaskutettava=onkoLaskutettava;
    }

    public int getPvm() {
        return pvm;
    }

    public void setPvm(int pvm) {
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
        return "Työpanos{" +
                "pvm=" + pvm +
                ", tunnit=" + tunnit +
                ", tehtävänkuvaus='" + tehtävänkuvaus + '\'' +
                ", onkoLaskutettava='" + onkoLaskutettava + '\'' +
                '}';
    }
}
