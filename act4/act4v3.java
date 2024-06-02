import java.util.Scanner;

public class act4v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int cols = scanner.nextInt();

        int[][] myArr = new int[rows][cols];

        System.out.println("Masukkan nilai untuk setiap elemen:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                myArr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("array multi dimensi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}