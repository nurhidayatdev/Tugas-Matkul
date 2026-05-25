public class contoh54 {
    public static void ulangiHalo() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Halo");
        }
    }
    public static void ulangiHalo(int berapakali) {
        for (int i = 1; i <= berapakali; i++) {
            System.out.println("Halo Overloading");
        }
    }

    public static void main(String[] args) {
        ulangiHalo();
        System.out.println();
        ulangiHalo(4);

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}