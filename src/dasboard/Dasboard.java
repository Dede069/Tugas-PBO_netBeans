package dasboard;

import CURD.koneksi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dasboard {

    static boolean isRun = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException {
        System.out.println("=====dasboard=====");
        System.out.println("[1] Arsip");
        System.out.println("[2] Hasil");
        System.out.println("[3] Progres");
        System.out.println("[4] Hewan");
        System.out.println("[5] Keluar");
        System.out.println("=====ooo00ooo=====");
        System.out.print("PILIH MENU: ");

        int pilihMenu = Integer.parseInt(input.readLine());
        switch (pilihMenu) {
            case 1:
                ArsipMenu.showArsipMenu();
                break;
            case 2:
                HasilMenu.showHasilMenu();
                break;
            case 3:
                ProgresMenu.showProgresMenu();
                break;
            case 4:
                HewanMenu.showHewanMenu();
                break;
            case 5:
                isRun = false;
                break;
            default:
                System.out.println("Pilihan tidak ada.");
        }
    }

    public static void main(String[] args) {
        while (isRun) {
            try {
                showMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
