class SuperKlas {
    private int nilaiSuper;

    public SuperKlas(int nilaiSuper) {
        this.nilaiSuper = nilaiSuper;
    }

    public int getNilaiSuper() {
        return nilaiSuper;
    }

    private void methodPrivate() {
        System.out.println("Ini method private");
    }

    protected void methodProtected() {
        System.out.println("Ini method protected");
    }
}

// --- File: SubKelas.java ---
class SubKelas extends SuperKlas {
    private double nilaiSub;

    public SubKelas(int nilaiSuper, double nilaiSub) {
        super(nilaiSuper);
        this.nilaiSub = nilaiSub;
    }

    public void methodSub() {
        super.methodProtected();
        System.out.println("Nilai Super: " + super.getNilaiSuper());
    }
}

public class lat41b {
    public static void main(String[] args) {

        System.out.println("Objek superclass");
        SuperKlas sup = new SuperKlas(5);
        System.out.println("Nilai super: " + sup.getNilaiSuper());
        sup.methodProtected();

        System.out.println("\nObjek subclass");
        SubKelas sub = new SubKelas(10, 9.5);
        
        System.out.println("Pemanggilan method superclass dari objek subclass");
        System.out.println("Nilai super: " + sub.getNilaiSuper());
        sub.methodProtected();

        System.out.println("Pemanggilan method superclass dari subclass");
        sub.methodSub();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}