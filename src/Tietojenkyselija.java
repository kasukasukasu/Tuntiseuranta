import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tietojenkyselija {

    public boolean loytyyId(int id) {
        try (Connection con = connect()) {
            String sql = "SELECT id FROM kayttaja WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeQuery();
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Eipä onnistunut käyttäjän haku id:llä");
        }
        return false;
    }

    public int lisaaTunnit(int id, int pvm, double tunnit, String tehtava, String laskutettava) {
        try (Connection con = connect()) {
            String sql = "INSERT INTO tunnit (kayttajaid, pvm, tunnit, tehtava, laskutettava) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, id);
            stmt.setInt(2, pvm);
            stmt.setDouble(3, tunnit);
            stmt.setString(4, tehtava);
            stmt.setString(5, laskutettava);
            int onnistui = stmt.executeUpdate();
            if (onnistui > 0) {
                return onnistui;
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public int lisaaTyontekija(String nimi, String osasto, String tehtavanimike) {
        try (Connection con = connect()) {
            String sql = "INSERT INTO kayttaja (nimi, osasto, tehtavanimike) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, nimi);
            stmt.setString(2, osasto);
            stmt.setString(3, tehtavanimike);
            stmt.executeUpdate();
            ResultSet avaimet = stmt.getGeneratedKeys();
            if (avaimet.next()) {
                int id = avaimet.getInt(1);
                return id;
            }
        } catch (Exception e) {

        }
        return 0;
    }

//    public List<Tyopanos> kaikkiTunnit() {
//        List<Tyopanos> tunnit = new ArrayList<>();
//        try (Connection con = connect()) {
//            String sql = "SELECT * FROM tunnit JOIN kayttaja ON id=tekijaid";
//            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
//            stmt.setString(1, nimi);
//            stmt.setString(2, osasto);
//            stmt.setString(3, tehtavanimike);
//            stmt.executeUpdate();
//            ResultSet avaimet = stmt.getGeneratedKeys();
//            if (avaimet.next()) {
//                int id = avaimet.getInt(1);
//                return id;
//            }
//        } catch (Exception e) {
//
//        }
//        return 0;
//    }
//
//    public List<Tyopanos> tyontekijanTunnit(int id) {
//
//    }
//
//    public List<Tyopanos> laskutettavatTunnit() {
//
//    }

    public Connection connect() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuntiseuranta?useSSL=false&serverTimezone=UTC",
                "root", "salasana");
        return con;
    }

}


