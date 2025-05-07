package Week6;
// File: Buku.java
public class Buku { // Umumnya kelas dibuat public
  private String judul;
  private String pengarang;

  public Buku(String judul, String pengarang) {
      this.judul = judul;
      this.pengarang = pengarang;
  }

  public String getJudul() {
      return judul;
  }

  public String getPengarang() {
      return pengarang;
  }
}