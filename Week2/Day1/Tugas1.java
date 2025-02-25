package Week2.Day1;

// Kelas Mobil
class Mobil {
  // Atribut
  String merk;
  int tahun;
  String warna;

  // Constructor untuk menginisialisasi atribut
  public Mobil(String merk, int tahun, String warna) {
      this.merk = merk;
      this.tahun = tahun;
      this.warna = warna;
  }

  // Method untuk menampilkan informasi mobil
  public void tampilkanInfo() {
      System.out.println("Merk: " + merk);
      System.out.println("Tahun: " + tahun);
      System.out.println("Warna: " + warna);
      System.out.println();
  }
}

// Program utama untuk membuat objek Mobil dan menampilkannya
public class Tugas1 {
  public static void main(String[] args) {
      // Membuat beberapa objek Mobil
      Mobil mobil1 = new Mobil("Toyota", 2020, "Merah");
      Mobil mobil2 = new Mobil("Honda", 2018, "Biru");
      Mobil mobil3 = new Mobil("BMW", 2022, "Hitam");

      // Menampilkan informasi masing-masing mobil
      mobil1.tampilkanInfo();
      mobil2.tampilkanInfo();
      mobil3.tampilkanInfo();
  }
}
