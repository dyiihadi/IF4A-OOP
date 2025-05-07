package Week6.Day2;
// MainBank.java
public class MainBank {
  public static void main(String[] args) {
      // Membuat Nasabah
      Nasabah nasabah1 = new Nasabah("N001", "Budi Santoso", "Jl. Merdeka 1");
      Nasabah nasabah2 = new Nasabah("N002", "Ani Lestari", "Jl. Sudirman 2");

      // Mengatur suku bunga bank (menggunakan metode static)
      System.out.println("Suku Bunga Awal Bank: " + (AkunBank.getSukuBungaTahunan() * 100) + "%");
      AkunBank.setSukuBungaTahunan(0.035); // Mengubah suku bunga menjadi 3.5%

      // Membuat Akun Bank
      AkunBank akunBudi = new AkunBank("111-222-001", nasabah1, 1000000);
      AkunBank akunAni = new AkunBank("111-222-002", nasabah2, 2500000);

      System.out.println("\n--- Informasi Akun Awal ---");
      System.out.println(akunBudi.getInfoAkun());
      System.out.println("---------------------------");
      System.out.println(akunAni.getInfoAkun());

      // Melakukan transaksi
      System.out.println("\n--- Transaksi Akun Budi ---");
      akunBudi.setor(500000);
      akunBudi.tarik(200000);
      akunBudi.tarik(1500000); // Mencoba tarik melebihi saldo

      System.out.println("\n--- Transaksi Akun Ani ---");
      akunAni.setor(1000000);

      // Menghitung bunga (contoh sederhana)
      double bungaBudi = akunBudi.hitungBungaSimpanan(365);
      System.out.println("\nPerkiraan bunga tahunan untuk Akun Budi: Rp" + bungaBudi);

      System.out.println("\n--- Informasi Akun Akhir ---");
      System.out.println(akunBudi.getInfoAkun());
      System.out.println("---------------------------");
      System.out.println(akunAni.getInfoAkun());

      // Mendemonstrasikan sifat final nomorRekening
      // Baris berikut akan menyebabkan error kompilasi jika dicoba:
      // akunBudi.nomorRekening = "BARU-001"; // Error: cannot assign a value to final variable nomorRekening

      // Menunjukkan bahwa suku bunga dibagi oleh semua akun
      AkunBank.setSukuBungaTahunan(0.04); // Mengubah suku bunga lagi
      System.out.println("\n--- Informasi Akun Setelah Suku Bunga Diubah Lagi ---");
      System.out.println(akunBudi.getInfoAkun()); // Suku bunga di info akun Budi akan berubah
      System.out.println("---------------------------");
      System.out.println(akunAni.getInfoAkun()); // Suku bunga di info akun Ani juga akan berubah
  }
}