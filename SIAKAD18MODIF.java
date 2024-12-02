import java.util.Scanner;

public class SIAKAD18MODIF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memperoleh input jumlah siswa dan jumlah mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Deklarasi array nilai dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Pengisian nilai
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Perhitungan rata-rata siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0 for (int j = 0; j < jumlahMatkul; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        // Perhitungan rata-rata mata kuliah
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        System.out.println("--------------------------------------");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": Rata-rata: " + totalPerMatkul / jumlahSiswa);
        }

        // Menutup scanner
        sc.close();
    }
}