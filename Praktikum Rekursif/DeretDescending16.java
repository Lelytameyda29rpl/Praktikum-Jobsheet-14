import java.util.Scanner;

public class DeretDescending16 {

    // Fungsi rekursif
    static void deretDescRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    static void deretDescIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = sc16.nextInt();

        // Panggil fungsi rekursif
        System.out.print("Deret Descending Rekursif: ");
        deretDescRekursif(n);
        System.out.println();

        // Panggil fungsi iteratif
        System.out.print("Deret Descending Iteratif: ");
        deretDescIteratif(n);
    }
}
