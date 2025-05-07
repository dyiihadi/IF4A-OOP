package Week3.Day1;
// Mobil.java
public class Mobil {
  // Atribut dienkapsulasi dengan modifier 'private'
  private String merk;
  private int tahunProduksi;
  private String warna;

  // Konstruktor untuk inisialisasi objek Mobil
  public Mobil(String merk, int tahunProduksi, String warna) {
      this.merk = merk;
      // Tambahkan validasi sederhana untuk tahun produksi di konstruktor
      if (tahunProduksi > 1800 && tahunProduksi <= java.time.Year.now().getValue() + 1) { // +1 untuk mobil model tahun depan
          this.tahunProduksi = tahunProduksi;
      } else {
          System.out.println("Peringatan: Tahun produksi tidak valid, menggunakan nilai default 0.");
          this.tahunProduksi = 0; // Nilai default jika tidak valid
      }
      this.warna = warna;
  }

  // Getter untuk atribut 'merk'
  public String getMerk() {
      return merk;
  }

  // Setter untuk atribut 'merk'
  public void setMerk(String merk) {
      this.merk = merk;
  }

  // Getter untuk atribut 'tahunProduksi'
  public int getTahunProduksi() {
      return tahunProduksi;
  }

  // Setter untuk atribut 'tahunProduksi'
  // Di sini kita bisa menambahkan validasi
  public void setTahunProduksi(int tahunProduksi) {
      if (tahunProduksi > 1800 && tahunProduksi <= java.time.Year.now().getValue() + 1) { // Batas tahun masuk akal, +1 untuk model tahun depan
          this.tahunProduksi = tahunProduksi;
      } else {
          System.out.println("Input tahun produksi tidak valid: " + tahunProduksi + ". Nilai tidak diubah.");
          // Atau bisa throw exception: throw new IllegalArgumentException("Tahun produksi tidak valid.");
      }
  }

  // Getter untuk atribut 'warna'
  public String getWarna() {
      return warna;
  }

  // Setter untuk atribut 'warna'
  public void setWarna(String warna) {
      this.warna = warna;
  }

  // Metode tambahan untuk menampilkan informasi mobil
  public void displayInfo() {
      System.out.println("Informasi Mobil:");
      System.out.println("Merk           : " + this.merk);
      System.out.println("Tahun Produksi : " + (this.tahunProduksi == 0 ? "Tidak Valid" : this.tahunProduksi) );
      System.out.println("Warna          : " + this.warna);
      System.out.println("--------------------");
  }
}