package Week6.Day2;
// Nasabah.java
public class Nasabah {
  private String idNasabah;
  private String nama;
  private String alamat;

  public Nasabah(String idNasabah, String nama, String alamat) {
      this.idNasabah = idNasabah;
      this.nama = nama;
      this.alamat = alamat;
  }

  public String getIdNasabah() {
      return idNasabah;
  }

  public String getNama() {
      return nama;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public String getAlamat() {
      return alamat;
  }

  public void setAlamat(String alamat) {
      this.alamat = alamat;
  }

  public String getInfoNasabah() {
      return "ID Nasabah: " + idNasabah + "\nNama: " + nama + "\nAlamat: " + alamat;
  }

  @Override
  public String toString() {
      return nama + " (ID: " + idNasabah + ")";
  }
}