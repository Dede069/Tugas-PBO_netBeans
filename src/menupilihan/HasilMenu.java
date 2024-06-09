package dasboard;

import CURD.HasilCRUD;
import data.Hasil;
import java.util.Scanner;

public class HasilMenu {
    static HasilCRUD hasilCRUD = new HasilCRUD();
    static Scanner scanner = new Scanner(System.in);

    public static void showHasilMenu() {
        while (true) {
            System.out.println("===== Hasil Menu =====");
            System.out.println("[1] Tambah Hasil");
            System.out.println("[2] Lihat Hasil");
            System.out.println("[3] Update Hasil");
            System.out.println("[4] Hapus Hasil");
            System.out.println("[5] Kembali");
            System.out.println("======================");
            System.out.print("Pilih menu: ");

            int pilihMenu = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihMenu) {
                case 1:
                    createHasil();
                    break;
                case 2:
                    readHasils();
                    break;
                case 3:
                    updateHasil();
                    break;
                case 4:
                    deleteHasil();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        }
    }

    static void createHasil() {
        System.out.print("Masukkan kode hasil: ");
        String kd_hasil = scanner.nextLine();
        System.out.print("Masukkan kode arsip: ");
        String kd_arsip = scanner.nextLine();
        System.out.print("Masukkan nomor surat: ");
        String no_surat = scanner.nextLine();
        System.out.print("Masukkan kode progres: ");
        String kd_progres = scanner.nextLine();
        System.out.print("Masukkan tanggal jawab: ");
        String tgl_jawab = scanner.nextLine();
        System.out.print("Masukkan hasil: ");
        String hasilText = scanner.nextLine();
        System.out.print("Masukkan kode penyakit: ");
        String kd_penyakit = scanner.nextLine();
        System.out.print("Masukkan jumlah diagnosa: ");
        int jml_diagnosa = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Hasil hasil = new Hasil(kd_hasil, kd_arsip, no_surat, kd_progres, tgl_jawab, hasilText, kd_penyakit, jml_diagnosa);
        hasilCRUD.createHasil(hasil);
    }

    static void readHasils() {
        hasilCRUD.readHasils().forEach(h -> {
            System.out.println(h.getKd_hasil() + "\t" + h.getKd_arsip() + "\t" + h.getNo_surat() + "\t" + h.getKd_progres() + "\t" + h.getTgl_jawab() + "\t" + h.getHasil() + "\t" + h.getKd_penyakit() + "\t" + h.getJml_diagnosa());
        });
    }

    static void updateHasil() {
        System.out.print("Masukkan kode hasil yang akan diupdate: ");
        String kd_hasil = scanner.nextLine();
        System.out.print("Masukkan kode arsip baru: ");
        String kd_arsip = scanner.nextLine();
        System.out.print("Masukkan nomor surat baru: ");
        String no_surat = scanner.nextLine();
        System.out.print("Masukkan kode progres baru: ");
        String kd_progres = scanner.nextLine();
        System.out.print("Masukkan tanggal jawab baru: ");
        String tgl_jawab = scanner.nextLine();
        System.out.print("Masukkan hasil baru: ");
        String hasilText = scanner.nextLine();
        System.out.print("Masukkan kode penyakit baru: ");
        String kd_penyakit = scanner.nextLine();
        System.out.print("Masukkan jumlah diagnosa baru: ");
        int jml_diagnosa = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Hasil hasil = new Hasil(kd_hasil, kd_arsip, no_surat, kd_progres, tgl_jawab, hasilText, kd_penyakit, jml_diagnosa);
        hasilCRUD.updateHasil(kd_hasil, hasil);
    }

    static void deleteHasil() {
        System.out.print("Masukkan kode hasil yang akan dihapus: ");
        String kd_hasil = scanner.nextLine();
        hasilCRUD.deleteHasil(kd_hasil);
    }
}
