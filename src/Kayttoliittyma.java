import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Kayttoliittyma {
    public static void main(String[] args) throws SQLException {
        Scanner lukija = new Scanner(System.in);
        Tietojenkyselija tk = new Tietojenkyselija();
        System.out.println("Tervetuloa HEU-tuntijärjestelmään!");
        while (true) {
            System.out.print("Haluatko 1) syöttää työntekijän tiedot vai 2) syöttää tuntitiedot tai 3) lopettaa? ");
            String vastaus = lukija.nextLine();
            if (vastaus.equals("1")) {
                lisaaTyontekija(lukija, tk);
            } else if (vastaus.equals("2")) {
                lisaaTunnit(lukija, tk);
            } else if (vastaus.equals("3")) {
                break;
            } else {
                System.out.println("Vastaa joko 1, 2 tai 3.");
            }
        }
    }

    private static void lisaaTunnit(Scanner lukija, Tietojenkyselija tk) {
        System.out.print("Id: ");
        int id = Integer.parseInt(lukija.nextLine());
        while (true) {
            if (tk.loytyyId(id)) {
                System.out.print("Päivämäärä (VVVVKKPP): ");
                int pvm = Integer.parseInt(lukija.nextLine());
                System.out.print("Tunnit (esim. 2.5): ");
                double tunnit = Double.parseDouble(lukija.nextLine());
                System.out.print("Tehtäväkuvaus/aihe/syy: ");
                String tehtava = lukija.nextLine();
                System.out.println("Oliko työ laskutettavaa? (k/e)");
                String vastaus = lukija.nextLine();
                String laskutettava = "";
                if (vastaus.equals("k")) {
                    laskutettava = "true";
                } else {
                    laskutettava = "false";
                }
                System.out.println("Syötit tiedot\nPäivämäärä: " + pvm + "\nTunnit: " + tunnit + "\nTehtäväkuvaus/aihe/syy: " + tehtava + "\nLaskutettava: " + vastaus);
                System.out.println("Lisätäänkö nämä tietokantaan? (k/e)");
                vastaus = lukija.nextLine();
                if (vastaus.equals("k")) {
                    int onnistui = tk.lisaaTunnit(id, pvm, tunnit, tehtava, laskutettava);
                    if (onnistui > 0) {
                        System.out.println("Tunnit lisätty.");
                    } else {
                        System.out.println("Tunteja ei voitu lisätä.");
                    }
                } else if (vastaus.equals("e")) {
                    return;
                }
            } else {
                System.out.println("Id:tä ei löytynyt järjestelmästä.");
            }
            System.out.println("Haluatko lisätä lisää tunteja? (k/e)");
            String vastaus = lukija.nextLine();
            if (vastaus.equals("e")) {
                break;
            }
        }
    }

    private static void lisaaTyontekija(Scanner lukija, Tietojenkyselija tk) {
        System.out.print("Nimi (sukunimi, etunimi): ");
        String nimi = lukija.nextLine();
        System.out.print("Osasto: ");
        String osasto = lukija.nextLine();
        System.out.print("Tehtävänimike: ");
        String tehtavanimike = lukija.nextLine();
        System.out.println("Syötit tiedot\nNimi: " + nimi + "\nOsasto: " + osasto + "\nTehtävänimike: " + tehtavanimike);
        System.out.println("Lisätäänkö nämä tietokantaan? (k/e)");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("k")) {
            int id = tk.lisaaTyontekija(nimi, osasto, tehtavanimike);
            System.out.println("Id:si tuntijärjestelmään on " + id + ". Tarvitset id:tä syöttäessäsi järjestelmään tietoa työtunneistasi.");
        } else if (vastaus.equals("e")) {
            return;
        }
    }
}
