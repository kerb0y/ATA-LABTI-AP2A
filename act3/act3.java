import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt(); 
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int k = tinggi - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}