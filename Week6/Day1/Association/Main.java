package Week6.Day1;
class Mahasiswa { // Tidak perlu public jika dalam satu file dengan Main
  private String nama;
  private int nim;

  public Mahasiswa(String nama, int nim) {
      this.nama = nama;
      this.nim = nim;
  }

  public String getNama() {
      return nama;
  }

  public int getNim() {
      return nim;
  }
}

class MataKuliah { // Tidak perlu public jika dalam satu file dengan Main
  private String kode;
  private String namaMatkul;

  public MataKuliah(String kode, String namaMatkul) {
      this.kode = kode;
      this.namaMatkul = namaMatkul;
  }

  public String getKode() {
      return kode;
  }

  public String getNamaMatkul() {
      return namaMatkul;
  }
}

public class Main { // Atau cukup 'class Main'
  public static void main(String[] args) {
      Mahasiswa mhs = new Mahasiswa("Budi", 12345);
      MataKuliah matkul = new MataKuliah("IF101", "Pemrograman");

      System.out.println(mhs.getNama() + " mengambil mata kuliah " + matkul.getNamaMatkul());
  }
}