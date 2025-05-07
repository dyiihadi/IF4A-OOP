package Week4.Day2;
// StatusPinjam.java
public enum StatusPinjam {
  TERSEDIA("Tersedia"),
  DIPINJAM("Dipinjam");

  private String deskripsi;

  StatusPinjam(String deskripsi) {
      this.deskripsi = deskripsi;
  }

  public String getDeskripsi() {
      return deskripsi;
  }
}