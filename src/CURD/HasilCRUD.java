package CURD;

import data.Hasil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HasilCRUD {

    public void createHasil(Hasil hasil) {
        String sql = "INSERT INTO table_hasil (kd_hasil, kd_arsip, no_surat, kd_progres, tgl_jawab, hasil, kd_penyakit, jml_diagnosa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hasil.getKd_hasil());
            pstmt.setString(2, hasil.getKd_arsip());
            pstmt.setString(3, hasil.getNo_surat());
            pstmt.setString(4, hasil.getKd_progres());
            pstmt.setString(5, hasil.getTgl_jawab());
            pstmt.setString(6, hasil.getHasil());
            pstmt.setString(7, hasil.getKd_penyakit());
            pstmt.setInt(8, hasil.getJml_diagnosa());
            pstmt.executeUpdate();

            System.out.println("Hasil berhasil ditambahkan.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Hasil> readHasils() {
        String sql = "SELECT * FROM table_hasil";
        List<Hasil> hasilList = new ArrayList<>();

        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String kd_hasil = rs.getString("kd_hasil");
                String kd_arsip = rs.getString("kd_arsip");
                String no_surat = rs.getString("no_surat");
                String kd_progres = rs.getString("kd_progres");
                String tgl_jawab = rs.getString("tgl_jawab");
                String hasilText = rs.getString("hasil");
                String kd_penyakit = rs.getString("kd_penyakit");
                int jml_diagnosa = rs.getInt("jml_diagnosa");
                Hasil hasil = new Hasil(kd_hasil, kd_arsip, no_surat, kd_progres, tgl_jawab, hasilText, kd_penyakit, jml_diagnosa);
                hasilList.add(hasil);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hasilList;
    }

    public void updateHasil(String kd_hasil, Hasil hasil) {
        String sql = "UPDATE table_hasil SET kd_arsip = ?, no_surat = ?, kd_progres = ?, tgl_jawab = ?, hasil = ?, kd_penyakit = ?, jml_diagnosa = ? WHERE kd_hasil = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hasil.getKd_arsip());
            pstmt.setString(2, hasil.getNo_surat());
            pstmt.setString(3, hasil.getKd_progres());
            pstmt.setString(4, hasil.getTgl_jawab());
            pstmt.setString(5, hasil.getHasil());
            pstmt.setString(6, hasil.getKd_penyakit());
            pstmt.setInt(7, hasil.getJml_diagnosa());
            pstmt.setString(8, kd_hasil);
            pstmt.executeUpdate();

            System.out.println("Hasil berhasil diupdate.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteHasil(String kd_hasil) {
        String sql = "DELETE FROM table_hasil WHERE kd_hasil = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kd_hasil);
            pstmt.executeUpdate();

            System.out.println("Hasil berhasil dihapus.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
