package latihan;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk memastikan Scanner ditutup setelah digunakan
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan jumlah uang yang dimiliki
            System.out.print("Masukkan jumlah uang yang Anda miliki: ");
            // Variabel duit digunakan untuk menyimpan jumlah uang yang dimasukkan pengguna
            int duit = scanner.nextInt();
            
            // Meminta pengguna memasukkan status keberadaan kelas kuliah pasangan
            System.out.print("Apakah pasangan Anda sedang tidak ada kelas di kuliahnya? (true/false): ");
            // Variabel tidakAdaKelasKuliah digunakan untuk menyimpan status keberadaan kelas kuliah pasangan
            boolean tidakAdaKelasKuliah = scanner.nextBoolean();
        
            // Cek kondisi untuk membeli migacon
            // Jika jumlah uang lebih besar dari 10000 dan pasangan tidak sedang tidak ada kelas kuliah, maka mencetak pesan "Kamu akan membeli migacon."
            if (duit > 10000 && !tidakAdaKelasKuliah) {
                System.out.println("Kamu akan membeli migacon.");
            } else {
                // Jika kondisi sebaliknya, maka mencetak pesan "Kamu tidak akan membeli migacon."
                System.out.println("Kamu tidak akan membeli migacon.");
            }
        }
    }
}
