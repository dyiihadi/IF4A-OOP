package Week6.Day2;
// ContohStaticFinal.java

class ContohKelas {
  // Variabel static: satu untuk semua objek, milik kelas
  public static int jumlahObjekDibuat = 0;

  // Variabel instance final: setiap objek punya, tapi nilainya konstan setelah dibuat
  public final String ID_OBJEK;

  // Variabel static final: konstanta level kelas
  public static final String NAMA_APLIKASI = "Aplikasi Demo V1.0";

  private String dataObjek;

  public ContohKelas(String id, String data) {
      this.ID_OBJEK = id; // Inisialisasi variabel final (hanya bisa sekali)
      this.dataObjek = data;
      jumlahObjekDibuat++; // Increment variabel static
  }

  // Metode static: bisa dipanggil tanpa objek
  public static void tampilkanNamaAplikasi() {
      System.out.println("Ini adalah: " + NAMA_APLIKASI);
      // System.out.println(this.dataObjek); // Error: 'this' tidak bisa digunakan di konteks static
      // System.out.println(ID_OBJEK); // Error: tidak bisa akses instance member dari static context
  }

  // Metode instance
  public void tampilkanInfoObjek() {
      System.out.println("ID Objek: " + ID_OBJEK);
      System.out.println("Data Objek: " + dataObjek);
      System.out.println("Total objek dibuat sejauh ini: " + jumlahObjekDibuat);
  }

  // Metode final: tidak bisa di-override oleh subclass
  public final void metodePenting() {
      System.out.println("Ini adalah metode penting yang tidak boleh diubah perilakunya.");
  }
}

// Kelas final: tidak bisa diwarisi
final class KelasUtilitasAkhir {
  public static double hitungLuasLingkaran(double radius) {
      return Math.PI * radius * radius;
  }
}

// class SubContohKelas extends ContohKelas { // Bisa
//     public SubContohKelas(String id, String data) {
//         super(id, data);
//     }
//     // @Override
//     // public void metodePenting() { // Error: metodePenting() di ContohKelas adalah final
//     //     System.out.println("Mencoba override metode penting.");
//     // }
// }

// class SubKelasUtilitas extends KelasUtilitasAkhir {} // Error: KelasUtilitasAkhir adalah final

public class DemoStaticFinal {
  public static void main(String[] args) {
      // Mengakses anggota static
      ContohKelas.tampilkanNamaAplikasi();
      System.out.println("Jumlah objek awal: " + ContohKelas.jumlahObjekDibuat); // Output: 0

      System.out.println("\nMembuat objek pertama...");
      ContohKelas obj1 = new ContohKelas("OBJ001", "Data Pertama");
      obj1.tampilkanInfoObjek();
      // obj1.ID_OBJEK = "GANTIID"; // Error: ID_OBJEK adalah final, tidak bisa diubah

      System.out.println("\nMembuat objek kedua...");
      ContohKelas obj2 = new ContohKelas("OBJ002", "Data Kedua");
      obj2.tampilkanInfoObjek(); // Perhatikan jumlahObjekDibuat akan bertambah

      // Variabel static jumlahObjekDibuat diakses melalui kelas atau objek (tapi sebaiknya via kelas)
      System.out.println("\nTotal objek akhir (via kelas): " + ContohKelas.jumlahObjekDibuat); // Output: 2
      System.out.println("Total objek akhir (via obj1): " + obj1.jumlahObjekDibuat); // Output: 2 (sama)

      obj1.metodePenting();

      System.out.println("\nLuas lingkaran radius 5: " + KelasUtilitasAkhir.hitungLuasLingkaran(5));
  }
}