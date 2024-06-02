import java.util.Scanner;

public class act2v3LA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga = 0, diskon = 0, totalHarga, jumlah, pilihan, hargaSebelumDiskon;

        System.out.println("==== SELAMAT DATANG DI PROPERTI SLIBIW ====");
        System.out.println("MENU PROPERTI\n 1. MEJA Rp 1.000.000\n 2. LEMARI Rp 2.000.000\n 3. LAMPU Rp 5.000.000\n 4. SOFA Rp 3.500.000\n 5. CERMIN Rp 2.500.000");

        System.out.print("Pilih Properti anda? [1-5]: ");
        pilihan = input.nextInt();
        System.out.print("Mau berapa kuantitas?     : ");
        jumlah = input.nextInt();

        switch(pilihan) {
            case 1: harga = 1000000; break;
            case 2: harga = 2000000; break;
            case 3: harga = 5000000; break;
            case 4: harga = 3500000; break;
            case 5: harga = 2500000; break;
            default: 
                System.out.println("Properti Tidak Tersedia");
                input.close(); return;
        }

        hargaSebelumDiskon = harga * jumlah;

        if (hargaSebelumDiskon >= 2500000 && hargaSebelumDiskon < 3500000) diskon = (hargaSebelumDiskon * 10) / 100;
        else if (hargaSebelumDiskon >= 3500000 && hargaSebelumDiskon < 5000000) diskon = (hargaSebelumDiskon * 20) / 100;
        else if (hargaSebelumDiskon >= 5000000) diskon = (hargaSebelumDiskon * 30) / 100;

        totalHarga = hargaSebelumDiskon - diskon;

        System.out.println("\nAnda memesan properti sebanyak " + jumlah + " item");
        System.out.println("Harga sebelum diskon : Rp " + hargaSebelumDiskon);
        System.out.println("Anda mendapatkan diskon " + (diskon * 100 / hargaSebelumDiskon) + "%");
        System.out.println("Harga setelah diskon : Rp " + totalHarga);

        input.close();
    }
}
