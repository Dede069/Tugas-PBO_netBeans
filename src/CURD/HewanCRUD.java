package CURD;

import data.Hewan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HewanCRUD {

    public void createHewan(Hewan hewan) {
        String sql = "INSERT INTO table_hewan (kd_hewan, hewan) VALUES (?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hewan.getKd_hewan());
            pstmt.setString(2, hewan.getHewan());
            pstmt.executeUpdate();

            System.out.println("Hewan berhasil ditambahkan.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Hewan> readHewans() {
        String sql = "SELECT * FROM table_hewan";
        List<Hewan> hewanList = new ArrayList<>();

        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String kd_hewan = rs.getString("kd_hewan");
                String hewan = rs.getString("hewan");
                Hewan h = new Hewan(kd_hewan, hewan);
                hewanList.add(h);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hewanList;
    }

    public void updateHewan(String kd_hewan, Hewan hewan) {
        String sql = "UPDATE table_hewan SET hewan = ? WHERE kd_hewan = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hewan.getHewan());
            pstmt.setString(2, kd_hewan);
            pstmt.executeUpdate();

            System.out.println("Hewan berhasil diupdate.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteHewan(String kd_hewan) {
        String sql = "DELETE FROM table_hewan WHERE kd_hewan = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kd_hewan);
            pstmt.executeUpdate();

            System.out.println("Hewan berhasil dihapus.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
