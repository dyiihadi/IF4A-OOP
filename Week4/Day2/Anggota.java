package Week4.Day2;
// Anggota.java
import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private List<Buku> bukuDipinjam; // Asosiasi: Anggota meminjam Buku

    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.bukuDipinjam = new ArrayList<>();
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public List<Buku> getBukuDipinjam() {
        return new ArrayList<>(bukuDipinjam); // Kembalikan salinan untuk enkapsulasi
    }

    public void tambahBukuPinjaman(Buku buku) {
        if (buku != null && !bukuDipinjam.contains(buku)) {
            this.bukuDipinjam.add(buku);
        }
    }

    public void hapusBukuPinjaman(Buku buku) {
        if (buku != null) {
            this.bukuDipinjam.remove(buku);
        }
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("ID Anggota: ").append(idAnggota).append("\n");
        info.append("Nama: ").append(nama).append("\n");
        info.append("Alamat: ").append(alamat).append("\n");
        info.append("Buku yang dipinjam (").append(bukuDipinjam.size()).append("):\n");
        if (bukuDipinjam.isEmpty()) {
            info.append("  Tidak ada buku yang sedang dipinjam.\n");
        } else {
            for (Buku buku : bukuDipinjam) {
                info.append("  - ").append(buku.getJudul()).append(" (ISBN: ").append(buku.getISBN()).append(")\n");
            }
        }
        return info.toString();
    }

    @Override
    public String toString() {
        return "Anggota[ID=" + idAnggota + ", Nama=" + nama + "]";
    }
}