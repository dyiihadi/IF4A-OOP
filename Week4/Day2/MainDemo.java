package Week4.Day2;
// MainDemo.java
public class MainDemo {
  public static void main(String[] args) {
      // 1. Buat Perpustakaan
      Perpustakaan perpusKota = new Perpustakaan("Perpustakaan Sentral Kota", "Jl. Pendidikan No. 1");
      System.out.println("Selamat datang di " + perpusKota.getNama());

      // 2. Tambah Buku ke Perpustakaan
      Buku buku1 = new Buku("Pemrograman Java Dasar", "Antonius", "978-001");
      Buku buku2 = new Buku("Struktur Data & Algoritma", "Betha", "978-002");
      Buku buku3 = new Buku("Belajar OOP", "Charlie", "978-003");
      Buku bukuLama = new Buku("Sejarah Kuno", "Delta", "978-000"); // Akan dihapus nanti

      perpusKota.tambahBuku(buku1);
      perpusKota.tambahBuku(buku2);
      perpusKota.tambahBuku(buku3);
      perpusKota.tambahBuku(bukuLama);
      perpusKota.tampilkanSemuaBuku();

      perpusKota.hapusBuku(bukuLama); // Contoh menghapus buku
      perpusKota.tampilkanSemuaBuku();

      // 3. Registrasi Anggota
      Anggota anggota1 = new Anggota("A001", "Andi", "Jl. Merdeka No. 10");
      Anggota anggota2 = new Anggota("A002", "Budi", "Jl. Kemerdekaan No. 20");

      perpusKota.registrasiAnggota(anggota1);
      perpusKota.registrasiAnggota(anggota2);
      perpusKota.tampilkanSemuaAnggota();

      // 4. Proses Peminjaman Buku
      System.out.println("\n--- Sesi Peminjaman Buku ---");
      perpusKota.pinjamkanBuku("A001", "978-001"); // Andi pinjam Java Dasar
      perpusKota.pinjamkanBuku("A002", "978-002"); // Budi pinjam Struktur Data
      perpusKota.pinjamkanBuku("A001", "978-002"); // Andi coba pinjam buku yang sudah dipinjam Budi (seharusnya gagal jika logika benar)
                                                // Seharusnya buku 978-002 statusnya DIPINJAM, jadi Andi gagal.

      // Cek status buku setelah peminjaman
      perpusKota.tampilkanSemuaBuku();

      // Cek buku yang dipinjam oleh anggota
      System.out.println("\n--- Info Anggota Setelah Peminjaman ---");
      System.out.println(anggota1.getInfo());
      System.out.println(anggota2.getInfo());

      // 5. Proses Pengembalian Buku
      System.out.println("\n--- Sesi Pengembalian Buku ---");
      perpusKota.terimaPengembalianBuku("A001", "978-001"); // Andi kembalikan Java Dasar
      
      // Andi coba kembalikan buku yang tidak dia pinjam (atau sudah dikembalikan)
      perpusKota.terimaPengembalianBuku("A001", "978-001"); 

      // Cek status buku setelah pengembalian
      perpusKota.tampilkanSemuaBuku();

      // Cek buku yang dipinjam oleh anggota setelah pengembalian
      System.out.println("\n--- Info Anggota Setelah Pengembalian ---");
      System.out.println(anggota1.getInfo());
      System.out.println(anggota2.getInfo());

      // Contoh kasus: anggota tidak ditemukan atau buku tidak ditemukan
      System.out.println("\n--- Contoh Kasus Gagal ---");
      perpusKota.pinjamkanBuku("A999", "978-001"); // Anggota tidak ada
      perpusKota.pinjamkanBuku("A002", "978-999"); // Buku tidak ada
  }
}