package CURD;

import data.Progres;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProgresCRUD {

    public void createProgres(Progres progres) {
        String sql = "INSERT INTO table_progres (kd_progres, tgl, tgl_kirim, kd_kecamatan, desa, kd_hewan, pemilik, " +
                     "kd_spesimen, kd_lab, jml, kd_jns_uji) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, progres.getKd_progres());
            pstmt.setString(2, progres.getTgl());
            pstmt.setString(3, progres.getTgl_kirim());
            pstmt.setString(4, progres.getKd_kecamatan());
            pstmt.setString(5, progres.getDesa());
            pstmt.setString(6, progres.getKd_hewan());
            pstmt.setString(7, progres.getPemilik());
            pstmt.setString(8, progres.getKd_spesimen());
            pstmt.setString(9, progres.getKd_lab());
            pstmt.setInt(10, progres.getJml());
            pstmt.setString(11, progres.getKd_jns_uji());

            pstmt.executeUpdate();

            System.out.println("Progres berhasil ditambahkan.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Progres> readProgres() {
        String sql = "SELECT * FROM table_progres";
        List<Progres> progresList = new ArrayList<>();

        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String kd_progres = rs.getString("kd_progres");
                String tgl = rs.getString("tgl");
                String tgl_kirim = rs.getString("tgl_kirim");
                String kd_kecamatan = rs.getString("kd_kecamatan");
                String desa = rs.getString("desa");
                String kd_hewan = rs.getString("kd_hewan");
                String pemilik = rs.getString("pemilik");
                String kd_spesimen = rs.getString("kd_spesimen");
                String kd_lab = rs.getString("kd_lab");
                int jml = rs.getInt("jml");
                String kd_jns_uji = rs.getString("kd_jns_uji");

                Progres p = new Progres(kd_progres, tgl, tgl_kirim, kd_kecamatan, desa, kd_hewan,
                                        pemilik, kd_spesimen, kd_lab, jml, kd_jns_uji);
                progresList.add(p);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return progresList;
    }

    public void updateProgres(String kd_progres, Progres progres) {
        String sql = "UPDATE table_progres SET tgl = ?, tgl_kirim = ?, kd_kecamatan = ?, desa = ?, kd_hewan = ?, " +
                     "pemilik = ?, kd_spesimen = ?, kd_lab = ?, jml = ?, kd_jns_uji = ? WHERE kd_progres = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, progres.getTgl());
            pstmt.setString(2, progres.getTgl_kirim());
            pstmt.setString(3, progres.getKd_kecamatan());
            pstmt.setString(4, progres.getDesa());
            pstmt.setString(5, progres.getKd_hewan());
            pstmt.setString(6, progres.getPemilik());
            pstmt.setString(7, progres.getKd_spesimen());
            pstmt.setString(8, progres.getKd_lab());
            pstmt.setInt(9, progres.getJml());
            pstmt.setString(10, progres.getKd_jns_uji());
            pstmt.setString(11, kd_progres);

            pstmt.executeUpdate();

            System.out.println("Progres berhasil diupdate.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProgres(String kd_progres) {
        String sql = "DELETE FROM table_progres WHERE kd_progres = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kd_progres);
            pstmt.executeUpdate();

            System.out.println("Progres berhasil dihapus.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
