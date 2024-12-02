import java.util.Scanner;

public class SIAKAD18 {

    public static void main(String[] args) {
        // 5. Buat array of int bernama nilai dengan 4 baris dan 3 kolom
        int[][] nilai = new int[4][3];

        // 6. Gunakan scanner dan nested loop untuk mengisi elemen pada array nilai.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // 7. Modifikasi kode program pada langkah 6 untuk menghitung dan menampilkan nilai rata-rata setiap siswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa / 3);
        }

        // 8. Tambahkan kode program untuk menghitung nilai rata-rata setiap mata kuliah
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        System.out.println("--------------------------------------");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul + " Rata-rata: " + totalPerMatkul / 4);
        }

        // Menutup scanner
        sc.close();
    }
}