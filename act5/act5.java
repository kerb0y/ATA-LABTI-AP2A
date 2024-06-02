// konstruktor ga pake parameter, 1 objek aja

class Kampus {
    String kampus , akreditasi , tahun ;
    
    Kampus() {
        kampus = "Gunadarma";
        akreditasi = "A";
        tahun = "1981";
    }

    String panggilNama() {
        return kampus;
    }
    String panggilAkre() {
        return akreditasi;
    }
    String panggilTahun() {
        return tahun;
    }

    public static void main(String[] args) {
        Kampus kampus = new Kampus();
        System.out.println("Ini adalah kampus "+ kampus.panggilNama());
        System.out.println("Kampus ini terakreditasi "+ kampus.panggilAkre());
        System.out.println("Kampus ini berdii pada tahun "+ kampus.panggilTahun());
        // kampus.panggilNama();
        // kampus.panggilAkre();
        // kampus.panggilTahun();
    }
}