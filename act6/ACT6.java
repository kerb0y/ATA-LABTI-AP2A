package act6;
public class ACT6 {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaArray = {
            new Mahasiswa("Ade Bintang", 19, "laki-laki"),
            new Mahasiswa("Ryan", 22, "laki-laki"),
            new Mahasiswa("Fahri", 22, "laki-laki")
        };

        for (Mahasiswa mahasiswa : mahasiswaArray) {
            mahasiswa.biodata();
        }
    }
}

class Mahasiswa {
    String name;
    int usia;
    String jenisKelamin;

    Mahasiswa(String name, int usia, String jenisKelamin) {
        this.name = name;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    void biodata() {
        System.out.println("\nNama         : " + name);
        System.out.println("Usia         : " + usia);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}