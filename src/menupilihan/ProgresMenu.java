package dasboard;

import CURD.ProgresCRUD;
import data.Progres;

import java.util.List;
import java.util.Scanner;

public class ProgresMenu {
    static ProgresCRUD progresCRUD = new ProgresCRUD();
    static Scanner scanner = new Scanner(System.in);

    public static void showProgresMenu() {
        while (true) {
            System.out.println("===== Progres Menu =====");
            System.out.println("[1] Tambah Progres");
            System.out.println("[2] Lihat Progres");
            System.out.println("[3] Update Progres");
            System.out.println("[4] Hapus Progres");
            System.out.println("[5] Kembali");
            System.out.println("========================");
            System.out.print("Pilih menu: ");

            int pilihMenu = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihMenu) {
                case 1:
                    createProgres();
                    break;
                case 2:
                    readProgres();
                    break;
                case 3:
                    updateProgres();
                    break;
                case 4:
                    deleteProgres();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        }
    }

    static void createProgres() {
        System.out.print("Masukkan kode progres: ");
        String kd_progres = scanner.nextLine();
        System.out.print("Masukkan tanggal: ");
        String tgl = scanner.nextLine();
        System.out.print("Masukkan tanggal kirim: ");
        String tgl_kirim = scanner.nextLine();
        System.out.print("Masukkan kode kecamatan: ");
        String kd_kecamatan = scanner.nextLine();
        System.out.print("Masukkan desa: ");
        String desa = scanner.nextLine();
        System.out.print("Masukkan kode hewan: ");
        String kd_hewan = scanner.nextLine();
        System.out.print("Masukkan nama pemilik: ");
        String pemilik = scanner.nextLine();
        System.out.print("Masukkan kode spesimen: ");
        String kd_spesimen = scanner.nextLine();
        System.out.print("Masukkan kode lab: ");
        String kd_lab = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jml = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Masukkan kode jenis uji: ");
        String kd_jns_uji = scanner.nextLine();

        Progres progres = new Progres(kd_progres, tgl, tgl_kirim, kd_kecamatan, desa, kd_hewan,
                                      pemilik, kd_spesimen, kd_lab, jml, kd_jns_uji);
        progresCRUD.createProgres(progres);
    }

    static void readProgres() {
        List<Progres> progresList = progresCRUD.readProgres();
        for (Progres p : progresList) {
            System.out.println("Kode Progres: " + p.getKd_progres());
            System.out.println("Tanggal: " + p.getTgl());
            System.out.println("Tanggal Kirim: " + p.getTgl_kirim());
            System.out.println("Kode Kecamatan: " + p.getKd_kecamatan());
            System.out.println("Desa: " + p.getDesa());
            System.out.println("Kode Hewan: " + p.getKd_hewan());
            System.out.println("Pemilik: " + p.getPemilik());
            System.out.println("Kode Spesimen: " + p.getKd_spesimen());
            System.out.println("Kode Lab: " + p.getKd_lab());
            System.out.println("Jumlah: " + p.getJml());
            System.out.println("Kode Jenis Uji: " + p.getKd_jns_uji());
            System.out.println();
        }
    }

    static void updateProgres() {
        System.out.print("Masukkan kode progres yang akan diupdate: ");
        String kd_progres = scanner.nextLine();
        System.out.print("Masukkan tanggal baru: ");
        String tgl = scanner.nextLine();
        System.out.print("Masukkan tanggal kirim baru: ");
        String tgl_kirim = scanner.nextLine();
        System.out.print("Masukkan kode kecamatan baru: ");
        String kd_kecamatan = scanner.nextLine();
        System.out.print("Masukkan desa baru: ");
        String desa = scanner.nextLine();
        System.out.print("Masukkan kode hewan baru: ");
        String kd_hewan = scanner.nextLine();
        System.out.print("Masukkan nama pemilik baru: ");
        String pemilik = scanner.nextLine();
        System.out.print("Masukkan kode spesimen baru: ");
        String kd_spesimen = scanner.nextLine();
        System.out.print("Masukkan kode lab baru: ");
        String kd_lab = scanner.nextLine();
        System.out.print("Masukkan jumlah baru: ");
        int jml = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Masukkan kode jenis uji baru: ");
        String kd_jns_uji = scanner.nextLine();

        Progres progres = new Progres(kd_progres, tgl, tgl_kirim, kd_kecamatan, desa, kd_hewan,
                                      pemilik, kd_spesimen, kd_lab, jml, kd_jns_uji);
        progresCRUD.updateProgres(kd_progres, progres);
    }

    static void deleteProgres() {
        System.out.print("Masukkan kode progres yang akan dihapus: ");
        String kd_progres = scanner.nextLine();
        progresCRUD.deleteProgres(kd_progres);
    }
}

