package Week6.Day2;
// AkunBank.java
public class AkunBank {
  // Atribut final, nilainya tidak bisa diubah setelah inisialisasi
  private final String nomorRekening;
  private double saldo;
  private Nasabah pemilik;

  // Atribut static, milik kelas, dibagi oleh semua objek AkunBank
  private static double sukuBungaTahunan = 0.02; // Contoh default suku bunga 2%

  public AkunBank(String nomorRekening, Nasabah pemilik, double saldoAwal) {
      this.nomorRekening = nomorRekening; // Inisialisasi atribut final
      this.pemilik = pemilik;
      if (saldoAwal >= 0) {
          this.saldo = saldoAwal;
      } else {
          this.saldo = 0;
          System.out.println("Saldo awal tidak valid, diatur menjadi 0.");
      }
  }

  // Getter untuk atribut final nomorRekening
  public String getNomorRekening() {
      return nomorRekening;
  }

  // Tidak ada setter untuk nomorRekening karena final

  public double getSaldo() {
      return saldo;
  }

  public Nasabah getPemilik() {
      return pemilik;
  }

  public void setor(double jumlah) {
      if (jumlah > 0) {
          this.saldo += jumlah;
          System.out.println("Setoran Rp" + jumlah + " berhasil. Saldo baru: Rp" + this.saldo);
      } else {
          System.out.println("Jumlah setoran tidak valid.");
      }
  }

  public boolean tarik(double jumlah) {
      if (jumlah > 0 && jumlah <= this.saldo) {
          this.saldo -= jumlah;
          System.out.println("Penarikan Rp" + jumlah + " berhasil. Saldo baru: Rp" + this.saldo);
          return true;
      } else if (jumlah > this.saldo) {
          System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
          return false;
      } else {
          System.out.println("Jumlah penarikan tidak valid.");
          return false;
      }
  }

  // Metode static untuk mengakses dan mengubah sukuBungaTahunan
  public static double getSukuBungaTahunan() {
      return sukuBungaTahunan;
  }

  public static void setSukuBungaTahunan(double bungaBaru) {
      if (bungaBaru >= 0) {
          sukuBungaTahunan = bungaBaru;
          System.out.println("Suku bunga tahunan bank diubah menjadi " + (bungaBaru * 100) + "%.");
      } else {
          System.out.println("Suku bunga tidak valid.");
      }
  }

  // Contoh metode yang menggunakan suku bunga
  public double hitungBungaSimpanan(int jumlahHariDalamSetahun) {
      if (jumlahHariDalamSetahun <= 0) return 0;
      // Ini adalah contoh sederhana, perhitungan bunga bank riil lebih kompleks
      double bunga = this.saldo * sukuBungaTahunan;
      return bunga; // Bunga per tahun
  }

  public String getInfoAkun() {
      return "Nomor Rekening: " + nomorRekening + "\nNasabah: " + pemilik.getNama() +
             "\nSaldo: Rp" + saldo + "\nSuku Bunga Bank Saat Ini: " + (sukuBungaTahunan * 100) + "% per tahun";
  }
}