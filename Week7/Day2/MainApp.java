package Week7.Day2;
// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("Budi", 5000000);
        System.out.println("Informasi Pegawai 1:");
        pegawai1.displayInfo();
        System.out.println("Nama: " + pegawai1.getNama());
        System.out.println("Gaji: " + pegawai1.getGaji());
        System.out.println("-------------------------");

        // Mengubah gaji pegawai1
        pegawai1.setGaji(5500000);
        System.out.println("Informasi Pegawai 1 (setelah naik gaji):");
        pegawai1.displayInfo();
        System.out.println("-------------------------");

        // Membuat objek Manager
        Manager manager1 = new Manager("Siti", 10000000, "Pemasaran");
        System.out.println("Informasi Manager 1:");
        manager1.displayInfo(); // Akan memanggil displayInfo() milik Manager
        System.out.println("Nama: " + manager1.getNama()); // Diwarisi dari Pegawai
        System.out.println("Gaji Pokok: " + manager1.getGaji()); // Diwarisi dari Pegawai
        System.out.println("Departemen: " + manager1.getDepartemen());
        System.out.println("Gaji Lengkap (dengan tunjangan 2jt): " + manager1.getGajiLengkap(2000000));
        System.out.println("-------------------------");

        // Mengubah departemen manager1
        manager1.setDepartemen("Sumber Daya Manusia");
        System.out.println("Informasi Manager 1 (setelah pindah departemen):");
        manager1.displayInfo();
    }
}