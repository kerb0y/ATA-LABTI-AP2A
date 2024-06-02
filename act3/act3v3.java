import java.util.Scanner;

public class act3v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulangi;

        do {
            System.out.println("\nSEGITIGA SIKU - SIKU BINTANG\n=============================");
            System.out.print("Masukkan Tinggi Segitiga: ");
            int tinggiBintang = scanner.nextInt();

            for (int i = 1; i <= tinggiBintang; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\nPERULANGAN KELIPATAN 5\n=============================");
            for (int i = 1; i <= 4; i++) {
                System.out.print(i * 5 + " ");
            }
            System.out.println();

            System.out.println("\nSEGITIGA SIKU - SIKU ANGKA\n=============================");
            System.out.print("Masukkan tinggi Segitiga: ");
            int tinggiAngka = scanner.nextInt();
            for (int i = tinggiAngka; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.print("\nAPAKAH ANDA INGIN MENGULANG LAGI? (Y/N): ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        System.out.println("PROGRAM TELAH SELESAI");
        scanner.close();
    }
}