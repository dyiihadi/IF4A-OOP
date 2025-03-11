package Week4.Day1;
class Mahasiswa {
  private String nama;
  private int nim;

  public Mahasiswa(String nama, int nim) {
      this.nama = nama;
      this.nim = nim;
  }

  public String getNama() {
      return nama;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public int getNim() {
      return nim;
  }

  public void setNim(int nim) {
      this.nim = nim;
  }
}

public class Main {
  public static void main(String[] args) {
      // Membuat tiga objek Mahasiswa
      Mahasiswa mhs1 = new Mahasiswa("Budi", 12345);
      Mahasiswa mhs2 = new Mahasiswa("Siti", 67890);
      Mahasiswa mhs3 = new Mahasiswa("Andi", 11223);

      // Menampilkan informasi mahasiswa
      System.out.println("Nama: " + mhs1.getNama() + ", NIM: " + mhs1.getNim());
      System.out.println("Nama: " + mhs2.getNama() + ", NIM: " + mhs2.getNim());
      System.out.println("Nama: " + mhs3.getNama() + ", NIM: " + mhs3.getNim());

      // Mengubah nama mahasiswa pertama
      mhs1.setNama("Hadi");
      mhs2.setNama("Aminah");
      mhs3.setNama("Anton");
      System.out.println("Nama mhs1 setelah diubah: " + mhs1.getNama());
      System.out.println("Nama mhs2 setelah diubah: " + mhs2.getNama());
      System.out.println("Nama mhs3 setelah diubah: " + mhs3.getNama());
  }
}