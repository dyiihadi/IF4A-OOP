package Week7.Day2;
public class Manager extends Pegawai {
    // Atribut tambahan khusus untuk Manager
    private String departemen;

    // Constructor
    public Manager(String nama, double gaji, String departemen) {
        // Memanggil constructor dari superclass (Pegawai)
        super(nama, gaji);
        this.departemen = departemen;
    }

    // Method Getter untuk departemen
    public String getDepartemen() {
        return departemen;
    }

    // Method Setter untuk departemen
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Override method displayInfo untuk menyertakan departemen
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil displayInfo dari kelas Pegawai
        System.out.println("Departemen: " + departemen);
    }

    public double getGajiLengkap(double tunjangan) {
        return super.getGaji() + tunjangan; // Mengakses gaji pokok dari Pegawai
    }
}