import java.io.*;
import java.util.*;

public class act7 {
  public static void main(String[] args) {
    // delarasi objek
    MyFile fileSaya = new MyFile();
    Scanner input = new Scanner(System.in);
    
    // input fnama file
    System.out.println("Masukkan Nama File: ");
    String namaFile = input.nextLine();

    String path = "./";
    File f = new File(path, namaFile);

    // manggil objek
    fileSaya.MakeFile(f);

    // looping isi file
    boolean jalan = true;
    while (jalan) {
        System.out.println("\nMasukkan Isi Text: ");
        String isi = input.nextLine();
        // Memanggil objek untuk menulis file
        fileSaya.WriteFile(f, isi);

        System.out.println("Ingin Menambah Text? (y/n): ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("n")) {
            jalan = false;
            break;
        }
    } 

    // memanggil objek untuk baca file
    fileSaya.ReadFile(f);
    input.close();
  }  
}

class MyFile {
  public void MakeFile(File f) {
    try {
      f.createNewFile();
    } catch (IOException err) {
      System.out.println("Gagal Membuat File : " + err.getMessage());      
    }
  }

  public static void WriteFile(File f, String isi) {
    try {
      FileWriter tulis = new FileWriter(f, true);
      tulis.write(isi + "\n");
      tulis.close();
    } catch (IOException err) {
      System.out.println("Gagal Menulis File : " + err.getMessage());
    }
  }

  public void ReadFile (File f) {
    try {
      BufferedReader baca = new BufferedReader(new FileReader(f));
      String isiFile;

      while ((isiFile = baca.readLine()) != null) {
        System.out.println(isiFile);
      }

      baca.close();

    } catch (IOException err) {
      System.out.println("Gagal Membaca File : " + err.getMessage());
    }
  }
}