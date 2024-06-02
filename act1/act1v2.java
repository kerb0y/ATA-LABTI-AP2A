import java.util.Scanner;

class act1v2 {
    public static void main(String[] args) {
        int a, b, plus, min, x, div;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama : ");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua   : ");
        b = input.nextInt();
        
        plus = a + b;
        min = a - b;
        x = a * b;
        div = a / b;

        System.out.println("");

        System.out.println(a + " + " + b + " = " + plus);
        System.out.println(a + " - " + b + " = " + min);
        System.out.println(a + " * " + b + " = " + x);
        System.out.println(a + " / " + b + " = " + div);

        input.close();
    }
}