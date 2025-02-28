package Week2.Day2;
class Mahasiswa{
  String nama;
  String nim;
  int umur;

  Mahasiswa(String nama, String nim, int umur){
    this.nama = nama;
    this.nim = nim;
    this.umur = umur;
  }


}

public class Latihan3 {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("Budi", "0001", 25);

    System.out.println("Nama: " + mhs1.nama);
    System.out.println("NIM: " + mhs1.nim); 
    System.out.println("Umur: " + mhs1.umur);
  }
}
