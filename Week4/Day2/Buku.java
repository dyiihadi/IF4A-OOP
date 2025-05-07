package Week4.Day2;
// Buku.java
public class Buku {
  private String judul;
  private String pengarang;
  private String ISBN;
  private StatusPinjam statusPeminjaman;

  public Buku(String judul, String pengarang, String ISBN) {
      this.judul = judul;
      this.pengarang = pengarang;
      this.ISBN = ISBN;
      this.statusPeminjaman = StatusPinjam.TERSEDIA; // Default status saat buku dibuat
  }

  public String getJudul() {
      return judul;
  }

  public String getPengarang() {
      return pengarang;
  }

  public String getISBN() {
      return ISBN;
  }

  public StatusPinjam getStatusPeminjaman() {
      return statusPeminjaman;
  }

  public void setStatusPeminjaman(StatusPinjam statusPeminjaman) {
      this.statusPeminjaman = statusPeminjaman;
  }

  public String getInfo() {
      return "Judul: " + judul + "\nPengarang: " + pengarang + "\nISBN: " + ISBN + "\nStatus: " + statusPeminjaman.getDeskripsi();
  }

  @Override
  public String toString() {
      return "Buku[Judul=" + judul + ", Pengarang=" + pengarang + ", ISBN=" + ISBN + ", Status=" + statusPeminjaman.getDeskripsi() + "]";
  }
}