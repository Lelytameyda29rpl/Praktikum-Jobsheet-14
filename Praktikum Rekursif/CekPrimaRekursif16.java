import java.util.Scanner;

public class CekPrimaRekursif16 {

    // Fungsi rekursif untuk mengecek bilangan prima
    static boolean cekPrimaRekursif(int n, int i) {
        // Base case: jika i mencapai nilai 1, berarti n adalah bilangan prima
        if (i == 1) {
            return true;
        }
        // Jika n habis dibagi i, maka n bukan bilangan prima
        if (n % i == 0) {
            return false;
        }
        // Panggil rekursif untuk nilai i yang lebih kecil
        return cekPrimaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        // Panggil fungsi rekursif untuk mengecek bilangan prima
        boolean isPrima = cekPrimaRekursif(n, n / 2);

        // Tampilkan hasil
        if (isPrima) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
