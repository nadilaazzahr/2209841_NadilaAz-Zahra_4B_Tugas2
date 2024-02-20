package latihan;

public class No3 {
    
    public static void main(String[] args) {
        // Mendapatkan kode ASCII dari karakter '4' dan '6'
        char char1 = '4';
        char char2 = '6';

        // Mengonversi karakter ke nilai ASCII dengan pengecoran (casting) ke tipe int
        int asciiValue1 = (int) char1;
        int asciiValue2 = (int) char2;

        // Menjumlahkan kode ASCII dari kedua karakter
        int sumOfAscii = asciiValue1 + asciiValue2;

        // Menampilkan hasil penjumlahan kode ASCII
        System.out.println("Jumlah kode ASCII dari karakter '4' dan '6' adalah: " + sumOfAscii);
    }
}
