package Week6;
// File: Perpustakaan.java
import java.util.List; // Import List karena digunakan di sini

public class Perpustakaan { // Umumnya kelas dibuat public
    private List<Buku> koleksiBuku;

    public Perpustakaan(List<Buku> koleksiBuku) {
        this.koleksiBuku = koleksiBuku;
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : koleksiBuku) {
            // Menampilkan judul dan pengarang
            System.out.println("- Judul: " + buku.getJudul() + ", Pengarang: " + buku.getPengarang());
        }
    }
}