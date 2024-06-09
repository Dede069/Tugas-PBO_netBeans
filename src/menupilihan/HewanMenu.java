package dasboard;

import CURD.HewanCRUD;
import data.Hewan;
import java.util.Scanner;

public class HewanMenu {
    static HewanCRUD hewanCRUD = new HewanCRUD();
    static Scanner scanner = new Scanner(System.in);

    public static void showHewanMenu() {
        while (true) {
            System.out.println("===== Hewan Menu =====");
            System.out.println("[1] Tambah Hewan");
            System.out.println("[2] Lihat Hewan");
            System.out.println("[3] Update Hewan");
            System.out.println("[4] Hapus Hewan");
            System.out.println("[5] Kembali");
            System.out.println("======================");
            System.out.print("Pilih menu: ");

            int pilihMenu = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihMenu) {
                case 1:
                    createHewan();
                    break;
                case 2:
                    readHewans();
                    break;
                case 3:
                    updateHewan();
                    break;
                case 4:
                    deleteHewan();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        }
    }

    static void createHewan() {
        System.out.print("Masukkan kode hewan: ");
        String kd_hewan = scanner.nextLine();
        System.out.print("Masukkan nama hewan: ");
        String hewan = scanner.nextLine();

        Hewan h = new Hewan(kd_hewan, hewan);
        hewanCRUD.createHewan(h);
    }

    static void readHewans() {
        hewanCRUD.readHewans().forEach(h -> {
            System.out.println(h.getKd_hewan() + "\t" + h.getHewan());
        });
    }

    static void updateHewan() {
        System.out.print("Masukkan kode hewan yang akan diupdate: ");
        String kd_hewan = scanner.nextLine();
        System.out.print("Masukkan nama hewan baru: ");
        String hewan = scanner.nextLine();

        Hewan h = new Hewan(kd_hewan, hewan);
        hewanCRUD.updateHewan(kd_hewan, h);
    }

    static void deleteHewan() {
        System.out.print("Masukkan kode hewan yang akan dihapus: ");
        String kd_hewan = scanner.nextLine();
        hewanCRUD.deleteHewan(kd_hewan);
    }
}
