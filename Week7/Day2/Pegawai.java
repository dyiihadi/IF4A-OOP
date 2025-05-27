package Week7.Day2;
public class Pegawai {
    // Atribut
    private String nama;
    private double gaji;

    // Constructor 
    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Method Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method Getter untuk gaji
    public double getGaji() { // Diperbaiki dari "getGaji(): doube"
        return gaji;
    }

    // Method Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void displayInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pegawai: " + gaji);
    }
}