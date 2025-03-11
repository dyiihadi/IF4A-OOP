package Week4.Day1;
public class Mobil {
  // Atribut dengan modifier private
  private String merk;
  private int tahunProduksi;
  private String warna;

  // Getter untuk merk
  public String getMerk() {
      return merk;
  }

  // Setter untuk merk
  public void setMerk(String merk) {
      this.merk = merk;
  }

  // Getter untuk tahunProduksi
  public int getTahunProduksi() {
      return tahunProduksi;
  }

  // Setter untuk tahunProduksi
  public void setTahunProduksi(int tahunProduksi) {
      this.tahunProduksi = tahunProduksi;
  }

  // Getter untuk warna
  public String getWarna() {
      return warna;
  }

  // Setter untuk warna
  public void setWarna(String warna) {
      this.warna = warna;
  }
}