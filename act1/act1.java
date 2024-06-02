import java.util.Scanner;

class act1 {
    public static void main(String[] args) {
        String nama, kelas, npm;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda    : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas Anda   : ");
        kelas = input.nextLine();
        System.out.print("Masukkan NPM Anda     : ");
        npm = input.nextLine();

        System.out.println("");
        
        System.out.println("========= BIODATA ANDA =========");
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("NPM     : " + npm);

        input.close();
    }
}