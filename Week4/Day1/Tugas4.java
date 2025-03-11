package Week4.Day1;
public class Tugas4 {
  public static void main(String[] args) {
      // Membuat tiga objek Mobil
      Mobil mobil1 = new Mobil();
      Mobil mobil2 = new Mobil();
      Mobil mobil3 = new Mobil();

      // Mengatur atribut untuk mobil1
      mobil1.setMerk("Toyota");
      mobil1.setTahunProduksi(2020);
      mobil1.setWarna("Merah");

      // Mengatur atribut untuk mobil2
      mobil2.setMerk("Honda");
      mobil2.setTahunProduksi(2021);
      mobil2.setWarna("Biru");

      // Mengatur atribut untuk mobil3
      mobil3.setMerk("Suzuki");
      mobil3.setTahunProduksi(2019);
      mobil3.setWarna("Hitam");

      // Menampilkan atribut mobil
      System.out.println("Data Mobil 1:");
      System.out.println("Merk: " + mobil1.getMerk());
      System.out.println("Tahun Produksi: " + mobil1.getTahunProduksi());
      System.out.println("Warna: " + mobil1.getWarna());

      System.out.println("\nData Mobil 2:");
      System.out.println("Merk: " + mobil2.getMerk());
      System.out.println("Tahun Produksi: " + mobil2.getTahunProduksi());
      System.out.println("Warna: " + mobil2.getWarna());

      System.out.println("\nData Mobil 3:");
      System.out.println("Merk: " + mobil3.getMerk());
      System.out.println("Tahun Produksi: " + mobil3.getTahunProduksi());
      System.out.println("Warna: " + mobil3.getWarna());

      // Mengubah nilai atribut menggunakan setter
      mobil1.setWarna("Putih");
      mobil2.setTahunProduksi(2022);
      mobil3.setMerk("Nissan");

      // Menampilkan atribut setelah diubah
      System.out.println("\nSetelah diubah:");
      System.out.println("Data Mobil 1:");
      System.out.println("Merk: " + mobil1.getMerk());
      System.out.println("Tahun Produksi: " + mobil1.getTahunProduksi());
      System.out.println("Warna: " + mobil1.getWarna());

      System.out.println("\nData Mobil 2:");
      System.out.println("Merk: " + mobil2.getMerk());
      System.out.println("Tahun Produksi: " + mobil2.getTahunProduksi());
      System.out.println("Warna: " + mobil2.getWarna());

      System.out.println("\nData Mobil 3:");
      System.out.println("Merk: " + mobil3.getMerk());
      System.out.println("Tahun Produksi: " + mobil3.getTahunProduksi());
      System.out.println("Warna: " + mobil3.getWarna());
  }
}