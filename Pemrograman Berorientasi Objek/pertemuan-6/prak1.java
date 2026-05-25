abstract class AlatMusik {
    abstract void mainkan();

    void setel() {
        System.out.println("Alat musik disetel.");
    }
}
class Gitar extends AlatMusik {
    @Override
    void mainkan() {
        System.out.println("Gitar dipetik: Jreng...!");
    }
}
class Piano extends AlatMusik {
    @Override
    void mainkan() {
        System.out.println("Piano ditekan: Ting...!");
    }
}

public class prak1 {
    public static void main(String[] args) {
        Gitar gitarKu = new Gitar();
        System.out.println("--- Percobaan Gitar ---");
        gitarKu.setel();   
        gitarKu.mainkan(); 

        System.out.println(); 

        Piano pianoKu = new Piano();
        System.out.println("--- Percobaan Piano ---");
        pianoKu.setel();   
        pianoKu.mainkan(); 

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}