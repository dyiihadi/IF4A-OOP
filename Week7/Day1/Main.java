package Week7.Day1;
class Kendaraan {
    protected String merk;
    protected int kecepatan;

    public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void info() {
        System.out.println("Merk : " + merk + ", Kecepatan: " + kecepatan);
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int kecepatan, int jumlahPintu) {
        super(merk, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

class Motor extends Kendaraan {
    private String jenisRoda;

    public Motor(String merk, int kecepatan, String jenisRoda) {
        super(merk, kecepatan);
        this.jenisRoda = jenisRoda;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Roda : " + jenisRoda);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 120, 4);
        Motor motor = new Motor("Honda", 80, "Dua Roda");

        mobil.info();
        System.out.println("--------------------");
        motor.info();
    }
}