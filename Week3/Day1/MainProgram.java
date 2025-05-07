package Week3.Day1;
// MainProgram.java
public class MainProgram {
  public static void main(String[] args) {
      // 1. Membuat objek dari kelas Mobil menggunakan konstruktor
      System.out.println("Membuat objek mobil pertama...");
      Mobil mobilSaya = new Mobil("Toyota Avanza", 2023, "Silver");

      // 2. Menampilkan atributnya menggunakan getter (atau metode displayInfo)
      System.out.println("\nMenampilkan atribut mobil pertama (via displayInfo):");
      mobilSaya.displayInfo();

      System.out.println("\nMenampilkan atribut mobil pertama (via getter individual):");
      System.out.println("Merk           : " + mobilSaya.getMerk());
      System.out.println("Tahun Produksi : " + mobilSaya.getTahunProduksi());
      System.out.println("Warna          : " + mobilSaya.getWarna());
      System.out.println("--------------------");

      // 3. Mengubah nilai atributnya menggunakan setter
      System.out.println("\nMengubah nilai atribut mobil pertama menggunakan setter...");
      mobilSaya.setWarna("Hitam Metalik");
      mobilSaya.setTahunProduksi(2024); // Mengubah tahun produksi
      mobilSaya.setMerk("Toyota Veloz"); // Mengubah merk

      // Mencoba input tahun yang tidak valid
      System.out.println("\nMencoba mengubah tahun produksi menjadi tidak valid:");
      mobilSaya.setTahunProduksi(1700); // Ini akan ditolak oleh validasi di setter

      // Menampilkan atribut setelah diubah
      System.out.println("\nMenampilkan atribut mobil pertama setelah diubah (via displayInfo):");
      mobilSaya.displayInfo();

      // Contoh membuat objek lain dengan tahun produksi awal yang mungkin tidak valid
      System.out.println("\nMembuat objek mobil kedua dengan tahun produksi awal tidak valid...");
      Mobil mobilTetangga = new Mobil("Honda Brio", 2050, "Merah");
      mobilTetangga.displayInfo(); // Akan menunjukkan tahun produksi tidak valid atau nilai default
      
      System.out.println("Mengubah tahun mobil tetangga menjadi valid...");
      mobilTetangga.setTahunProduksi(2022);
      mobilTetangga.displayInfo();
  }
}