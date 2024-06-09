package dasboard;

import CURD.ArsipCRUD;
import java.util.Scanner;

public class ArsipMenu {
    static ArsipCRUD arsipCRUD = new ArsipCRUD();
    static Scanner scanner = new Scanner(System.in);

    public static void showArsipMenu() {
        while (true) {
            System.out.println("===== Arsip Menu =====");
            System.out.println("[1] Tambah Arsip");
            System.out.println("[2] Lihat Arsip");
            System.out.println("[3] Update Arsip");
            System.out.println("[4] Hapus Arsip");
            System.out.println("[5] Kembali");
            System.out.println("======================");
            System.out.print("Pilih menu: ");

            int pilihMenu = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihMenu) {
                case 1:
                    createArsip();
                    break;
                case 2:
                    readArsips();
                    break;
                case 3:
                    updateArsip();
                    break;
                case 4:
                    deleteArsip();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        }
    }

    static void createArsip() {
        System.out.print("Masukkan kode arsip: ");
        String kd_arsip = scanner.nextLine();
        System.out.print("Masukkan arsip: ");
        String arsip = scanner.nextLine();
        arsipCRUD.createArsip(kd_arsip, arsip);
    }

    static void readArsips() {
        arsipCRUD.readArsips();
    }

    static void updateArsip() {
        System.out.print("Masukkan kode arsip yang akan diupdate: ");
        String kd_arsip = scanner.nextLine();
        System.out.print("Masukkan arsip baru: ");
        String newArsip = scanner.nextLine();
        arsipCRUD.updateArsip(kd_arsip, newArsip);
    }

    static void deleteArsip() {
        System.out.print("Masukkan kode arsip yang akan dihapus: ");
        String kd_arsip = scanner.nextLine();
        arsipCRUD.deleteArsip(kd_arsip);
    }
}
