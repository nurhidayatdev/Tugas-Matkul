import java.util.Scanner;

public class prak22 {
    final double PHI = 3.14;
    double jariJari;
    double tinggi;

    public double alasKerucut(double phi, double r) {
        double luasAlas = phi * Math.pow(r, 2);
        return luasAlas;
    }

    public double volumeKerucut(double phi, double r, double tinggi) {
        double volume = (alasKerucut(phi, r) * tinggi) / 3.0;
        return volume;
    }

    public static void main(String[] args) {
        prak22 kerucut = new prak22();
        
        Scanner bacaInput = new Scanner(System.in);

        System.out.print("Masukkan nilai jari-jari alas kerucut: ");
        kerucut.jariJari = bacaInput.nextDouble();

        System.out.print("Masukkan nilai tinggi kerucut: ");
        kerucut.tinggi = bacaInput.nextDouble();

        double nilaiVolume = kerucut.volumeKerucut(kerucut.PHI, kerucut.jariJari, kerucut.tinggi);

        System.out.println("Volume kerucut: " + nilaiVolume);
        
        bacaInput.close(); 

        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}