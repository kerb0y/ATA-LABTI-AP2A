import java.util.Scanner;

class act2 {
    public static void main(String[] args) {
        int a, b, c, sum, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Matematika Dasar :");
        a = input.nextInt();
        System.out.print("Masukkan Nilai Matematika Informatika :");
        b = input.nextInt();
        System.out.print("Masukkan Nilai Matematika Algoritma dan Pemrograman :");
        c = input.nextInt();
        
        sum = a + b + c;
        result = sum / 3;

        System.out.println("");

        System.out.println("==== Nilai IPK Ujian Utama Tingkat 2 ====");
        System.out.println("Nilai Rata-Rata :" + result);

        if (result >= 90) {
            System.out.println("Grade Nilai : A");
        } else if (result >= 80) {
            System.out.println("Grade Nilai : B");
        } else if (result >= 70) {
            System.out.println("Grade Nilai : C");
        } else {
            System.out.println("Grade Nilai : D");
        }

        input.close();
    }
}