import java.util.Scanner;

public class BioskopWithScannerModif {
    private static final int ROWS = 5; // Jumlah baris
    private static final int COLS = 5; // Jumlah kolom
    private static String[][] kursi = new String[ROWS][COLS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputDataPenonton(scanner);
                    break;
                case 2:
                    tampilkanDaftarPenonton();
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }

    private static void inputDataPenonton(Scanner scanner) {
        System.out.print("Masukkan nama penonton: ");
        String nama = scanner.next();

        int baris, kolom;
        while (true) {
            System.out.print("Masukkan baris (0-" + (ROWS - 1) + "): ");
            baris = scanner.nextInt();
            System.out.print("Masukkan kolom (0-" + (COLS - 1) + "): ");
            kolom = scanner.nextInt();

            // Validasi input kursi
            if (baris < 0 || baris >= ROWS || kolom < 0 || kolom >= COLS) {
                System.out.println("Kursi tidak tersedia. Silakan masukkan baris dan kolom yang valid.");
            } else if (kursi[baris][kolom] != null) {
                System.out.println("Kursi sudah terisi oleh penonton lain. Silakan masukkan baris dan kolom yang lain.");
            } else {
                // Mengisi kursi dengan nama penonton
                kursi[baris][kolom] = nama;
                System.out.println("Data penonton berhasil dimasukkan.");
                break;
            }
        }
    }

    private static void tampilkanDaftarPenonton() {
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Ganti null dengan ***
                if (kursi[i][j] == null) {
                    System.out.print("*** ");
                } else {
                    System.out.print(kursi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}