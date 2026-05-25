class KelasSatu {
    public KelasSatu() {
        System.out.println("Konstruktor Kelas Satu");
    }
}
class KelasDua extends KelasSatu {
    public KelasDua() {
        System.out.println("Kelas Dua");
    }
}
public class lat41a {
    public static void main(String[] args) {
        KelasDua kd = new KelasDua();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}