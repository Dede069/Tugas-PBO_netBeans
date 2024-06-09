package CURD;

import data.Arsip;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArsipCRUD {
    public void createArsip(String kd_arsip, String arsip) {
        String sql = "INSERT INTO table_arsip (kd_arsip, arsip) VALUES (?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kd_arsip);
            pstmt.setString(2, arsip);
            pstmt.executeUpdate();

            System.out.println("Arsip berhasil ditambahkan.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readArsips() {
        String sql = "SELECT * FROM table_arsip";

        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String kd_arsip = rs.getString("kd_arsip");
                String arsip = rs.getString("arsip");
                System.out.println(kd_arsip + "\t" + arsip);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateArsip(String kd_arsip, String newArsip) {
        String sql = "UPDATE table_arsip SET arsip = ? WHERE kd_arsip = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newArsip);
            pstmt.setString(2, kd_arsip);
            pstmt.executeUpdate();

            System.out.println("Arsip berhasil diupdate.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteArsip(String kd_arsip) {
        String sql = "DELETE FROM table_arsip WHERE kd_arsip = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kd_arsip);
            pstmt.executeUpdate();

            System.out.println("Arsip berhasil dihapus.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
