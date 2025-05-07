package Week6;
// File: Main.java
import java.util.ArrayList; // Import ArrayList
import java.util.List;      // Import List

public class Main { // Kelas yang ada main method biasanya public
    public static void main(String[] args) {
        // Membuat list untuk menyimpan objek Buku
        List<Buku> daftarAwal = new ArrayList<>();

        // Menambahkan beberapa objek Buku ke list
        daftarAwal.add(new Buku("Pemrograman Java", "John Doe")); // Saya perbaiki typo "Peerograman"
        daftarAwal.add(new Buku("Struktur Data", "Jane Doe"));
        daftarAwal.add(new Buku("Basis Data", "Peter Jones")); // Contoh tambahan

        // Membuat objek Perpustakaan dengan list buku tadi
        Perpustakaan perpustakaan = new Perpustakaan(daftarAwal);

        // Memanggil method untuk menampilkan buku
        perpustakaan.tampilkanBuku();
    }
}