import java.util.Scanner;

class act2v2 {
    public static void main(String[] args) {
        int mam, mimi;

        Scanner input = new Scanner(System.in);

        System.out.println("MENU KEDAI");
        System.out.println("Makanan \n1. Bakso\n 2. Mie Ayam\n 3. Bihun");
        System.out.println("Minuman \n1. Es Campur\n 2. Soda\n 3. Air Putih");

        System.out.print("Masukkan Pilihan Makanan [ 1 - 3]    : ");
        mam = input.nextInt();
        System.out.print("Masukkan Pilihan Minuman [ 1 - 3]    : ");
        mimi = input.nextInt();

        System.out.println("");

        switch(mam) {
            case 1:
                System.out.println("Makanan yang anda pesan adalah Bakso ");
                break;
            case 2:
                System.out.println("Makanan yang anda pesan adalah Mie Ayam ");
                break;
            case 3:
                System.out.println("Makanan yang anda pesan adalah Bihun ");
                break;
            default:
                System.out.println("Anda tidak pesan makanan ");
                break;
        }

        switch(mimi) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Es Campur ");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Soda ");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Air Putih ");
                break;
            default:
                System.out.println("Anda tidak pesan minuman ");
                break;
        }
        input.close();
    }
}