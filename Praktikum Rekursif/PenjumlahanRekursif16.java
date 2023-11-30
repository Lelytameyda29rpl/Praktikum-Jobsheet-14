import java.util.Scanner;

public class PenjumlahanRekursif16 {

    // Fungsi rekursif untuk menghitung penjumlahan bilangan
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasil = n + penjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan nilai f: ");
        int n = sc16.nextInt();

        // Panggil fungsi rekursif untuk menghitung penjumlahan
        int hasil = penjumlahanRekursif(n);

        // Tampilkan hasil penjumlahan
        System.out.println(" = " + hasil);
    }
}
