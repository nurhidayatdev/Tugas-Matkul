class Kendaraan {
    protected String merk;
    protected String model;

    public void infoKendaraan() {
        System.out.println("Ini adalah kendaraan merk " + merk + " model " + model);
    }

    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan...");
    }
}

class Mobil extends Kendaraan {
    private int jumlahPintu;

    public void setDataMobil(String merk, String model, int pintu) {
        this.merk = merk; 
        this.model = model;
        this.jumlahPintu = pintu;
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + merk + " terbuka.");
    }

    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Tipe: Mobil, Jumlah Pintu: " + jumlahPintu);
    }
}

class Motor extends Kendaraan {
    private String tipeRantai;

    public void setDataMotor(String merk, String model, String rantai) {
        this.merk = merk;
        this.model = model;
        this.tipeRantai = rantai;
    }

    public void lakukanWheelie() {
        System.out.println("Motor " + model + " sedang atraksi wheelie!");
    }

    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Tipe: Motor, Jenis Rantai: " + tipeRantai);
    }
}

public class tantangan4 {
    public static void main(String[] args) {

        Mobil mobilSaya = new Mobil();
        mobilSaya.setDataMobil("Toyota", "GR Yaris", 3);
        mobilSaya.nyalakanMesin(); 
        mobilSaya.infoKendaraan();
        mobilSaya.bukaBagasi();

        System.out.println("---");

        Motor motorSaya = new Motor();
        motorSaya.setDataMotor("Honda", "CBR250RR", "O-Ring");
        motorSaya.nyalakanMesin();
        motorSaya.infoKendaraan();
        motorSaya.lakukanWheelie();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}