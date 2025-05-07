package Week4.Day2;
// Perpustakaan.java
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Perpustakaan {
    private String nama;
    private String alamat;
    private List<Buku> daftarBuku;       // Agregasi: Perpustakaan memiliki Buku
    private List<Anggota> daftarAnggota; // Asosiasi: Perpustakaan mendaftar Anggota

    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // Manajemen Buku (Agregasi)
    public void tambahBuku(Buku buku) {
        if (buku != null && !daftarBuku.contains(buku)) {
            this.daftarBuku.add(buku);
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil ditambahkan ke perpustakaan.");
        } else {
            System.out.println("Gagal menambahkan buku: buku null atau sudah ada.");
        }
    }

    public void hapusBuku(Buku buku) {
        if (buku != null && daftarBuku.remove(buku)) {
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dihapus dari perpustakaan.");
        } else {
            System.out.println("Gagal menghapus buku: buku null atau tidak ditemukan.");
        }
    }

    public Optional<Buku> cariBukuByISBN(String isbn) {
        for (Buku buku : daftarBuku) {
            if (buku.getISBN().equalsIgnoreCase(isbn)) {
                return Optional.of(buku);
            }
        }
        return Optional.empty();
    }
    
    public void tampilkanSemuaBuku() {
        System.out.println("\nDaftar Buku di " + nama + ":");
        if (daftarBuku.isEmpty()) {
            System.out.println("  Tidak ada buku di perpustakaan.");
            return;
        }
        for (Buku buku : daftarBuku) {
            System.out.println("  - " + buku.getJudul() + " (ISBN: " + buku.getISBN() + ") - Status: " + buku.getStatusPeminjaman().getDeskripsi());
        }
    }

    // Manajemen Anggota (Asosiasi)
    public void registrasiAnggota(Anggota anggota) {
        if (anggota != null && !daftarAnggota.contains(anggota)) {
            this.daftarAnggota.add(anggota);
            System.out.println("Anggota \"" + anggota.getNama() + "\" berhasil diregistrasi.");
        } else {
            System.out.println("Gagal registrasi anggota: anggota null atau sudah terdaftar.");
        }
    }
    
    public Optional<Anggota> cariAnggotaByID(String idAnggota) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getIdAnggota().equalsIgnoreCase(idAnggota)) {
                return Optional.of(anggota);
            }
        }
        return Optional.empty();
    }

    public void tampilkanSemuaAnggota() {
        System.out.println("\nDaftar Anggota di " + nama + ":");
        if (daftarAnggota.isEmpty()) {
            System.out.println("  Tidak ada anggota terdaftar.");
            return;
        }
        for (Anggota anggota : daftarAnggota) {
            System.out.println("  - " + anggota.getNama() + " (ID: " + anggota.getIdAnggota() + ")");
        }
    }

    // Proses Peminjaman dan Pengembalian
    public boolean pinjamkanBuku(String idAnggota, String isbnBuku) {
        Optional<Anggota> optAnggota = cariAnggotaByID(idAnggota);
        Optional<Buku> optBuku = cariBukuByISBN(isbnBuku);

        if (!optAnggota.isPresent()) {
            System.out.println("Peminjaman gagal: Anggota dengan ID " + idAnggota + " tidak ditemukan.");
            return false;
        }
        if (!optBuku.isPresent()) {
            System.out.println("Peminjaman gagal: Buku dengan ISBN " + isbnBuku + " tidak ditemukan.");
            return false;
        }

        Anggota anggota = optAnggota.get();
        Buku buku = optBuku.get();

        if (buku.getStatusPeminjaman() == StatusPinjam.DIPINJAM) {
            System.out.println("Peminjaman gagal: Buku \"" + buku.getJudul() + "\" sedang dipinjam.");
            return false;
        }

        buku.setStatusPeminjaman(StatusPinjam.DIPINJAM);
        anggota.tambahBukuPinjaman(buku);
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam oleh " + anggota.getNama() + ".");
        return true;
    }

    public boolean terimaPengembalianBuku(String idAnggota, String isbnBuku) {
        Optional<Anggota> optAnggota = cariAnggotaByID(idAnggota);
        Optional<Buku> optBuku = cariBukuByISBN(isbnBuku);

        if (!optAnggota.isPresent()) {
            System.out.println("Pengembalian gagal: Anggota dengan ID " + idAnggota + " tidak ditemukan.");
            return false;
        }
        if (!optBuku.isPresent()) {
            System.out.println("Pengembalian gagal: Buku dengan ISBN " + isbnBuku + " tidak ditemukan.");
            return false;
        }
        
        Anggota anggota = optAnggota.get();
        Buku buku = optBuku.get();

        if (!anggota.getBukuDipinjam().contains(buku) || buku.getStatusPeminjaman() == StatusPinjam.TERSEDIA) {
             System.out.println("Pengembalian gagal: Buku \"" + buku.getJudul() + "\" tidak tercatat dipinjam oleh " + anggota.getNama() + " atau sudah tersedia.");
            return false;
        }

        buku.setStatusPeminjaman(StatusPinjam.TERSEDIA);
        anggota.hapusBukuPinjaman(buku);
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dikembalikan oleh " + anggota.getNama() + ".");
        return true;
    }
}