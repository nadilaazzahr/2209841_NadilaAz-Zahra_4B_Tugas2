package latihan; //deklarasi package(folder) untuk kelas 'No1'

import java.util.Scanner; //mengimpor kelas 'Scanner' dari paket 'java.util'

public class No1 {
    public static void main(String[] args) { //
        // Meminta pengguna memasukkan tiga bilangan bulat negatif
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan tiga bilangan bulat negatif
            System.out.println("Masukkan tiga bilangan bulat negatif:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            
            // Melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian
            int additionResult = num1 + num2 + num3;
            int subtractionResult = num1 - num2 - num3;
            int multiplicationResult = num1 * num2 * num3;
            double divisionResult = (double) num1 / num2 / num3;
            
            // Menampilkan hasil operasi
            System.out.println("Hasil penjumlahan: " + additionResult);
            System.out.println("Hasil pengurangan: " + subtractionResult);
            System.out.println("Hasil perkalian: " + multiplicationResult);
            System.out.println("Hasil pembagian: " + divisionResult);
        }
    }
}
