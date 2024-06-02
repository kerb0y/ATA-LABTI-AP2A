import java.util.Scanner;

class act2v3 {
    public static void main(String[] args) {
        int prop, harga, disc, tot, qty;

        Scanner input = new Scanner(System.in);

        System.out.println("==== SELAMAT DATANG DI PROPERTI SLIBIW ====");
        System.out.println("MENU MAKANAN\n ");
        System.out.println("1. MEJA Rp 1.000.000\n 2. LEMARI Rp 2.000.000\n 3. LAMPU Rp 30.000\n 4. SOFA Rp 1.500.000\n 5. CERMIN Rp 150.000");

        System.out.print("Pilih Properti anda? [ 1 - 5]     : ");
        prop = input.nextInt();
        System.out.print("Mau berapa kuantitas?             : ");
        qty = input.nextInt();

        System.out.println("");

        switch(prop) {
            case 1:
                harga = 1000000;
                System.out.println("Anda memesan meja sebanyak " + qty + " item");
                if (qty >= 4) {
                    disc = harga - 100000;
                } else {
                    disc = harga - 10000;
                }
                tot = harga * qty - disc;
                System.out.println("Harga : " + tot);
                break;
            case 2:
                harga = 2000000;
                System.out.println("Anda memesan lemari sebanyak " + qty + " item");
                if (qty >= 4) {
                    disc = harga - 100000;
                } else {
                    disc = harga - 10000;
                }
                tot = harga * qty - disc;
                System.out.println("Harga : " + tot);
                break;
            case 3:
                harga = 30000;
                System.out.println("Anda memesan lampu sebanyak " + qty + " item");
                if (qty >= 4) {
                    disc = harga - 100000;
                } else {
                    disc = harga - 10000;
                }                
                tot = harga * qty - disc;
                System.out.println("Harga : " + tot);
                break;
            case 4:
                harga = 1500000;
                System.out.println("Anda memesan sofa sebanyak " + qty + " item");
                if (qty >= 4) {
                    disc = harga - 100000;
                } else {
                    disc = harga - 10000;
                }                
                tot = harga * qty - disc;
                System.out.println("Harga : " + tot);
                break;
            case 5:
                harga = 150000;
                System.out.println("Anda memesan cermin sebanyak " + qty + " item");
                if (qty >= 4) {
                    disc = harga - 100000;
                } else {
                    disc = harga - 10000;
                }                
                tot = harga * qty - disc;
                System.out.println("Harga : " + tot);
                break;
            default:
                System.out.println("Anda tidak pesan apapun ");
                break;
        }
       input.close();
    }
}