class Kendaraan {
    String merk;
    String harga;

    public void infoKendaraan() {
        System.out.println("Kendaraan dengan merk " + merk + " & harga " + harga);
    }
}

class Mobil extends Kendaraan {
    public void setDataMobil(String merk, String harga) {
        this.merk = merk; 
        this.harga = harga;
    }
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
    }
}

public class soal4 {
    public static void main(String[] args) {

        Mobil Toyota = new Mobil();
        Toyota.setDataMobil("Toyota", "25000000");
        Toyota.infoKendaraan();

        Mobil Honda = new Mobil();
        Honda.setDataMobil("Honda", "35000000");
        Honda.infoKendaraan();

        Mobil Mitsubishi = new Mobil();
        Mitsubishi.setDataMobil("Mitsubishi", "15000000");
        Mitsubishi.infoKendaraan();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}