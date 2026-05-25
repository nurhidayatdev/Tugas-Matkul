abstract class Animal {
    private String nama;
    private String sifat;
    private int ukuran;
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    public int getUkuran() {
        return ukuran;
    }
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }
    public String getSifat() {
        return sifat;
    }
}

class Mamalia extends Animal {
    private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;
    public Mamalia() {
    }
    public Mamalia(String nama) {
        setNama(nama);
    }
    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }
    public boolean getBisaJalan() {
        return bisaJalan;
    }
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    public int getJumlahKaki() {
        return jumlahKaki;
    }
    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }
    public String getJenisMamalia() {
        return jenisMamalia;
    }
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }
    
    public String getJalan() {
        return jalan;
    }
}

class Aves extends Animal {
    private String jenisAves;
    private String terbang;
    private boolean bisaTerbang;
    public Aves() {
    }
    public Aves(String nama, double ukuran) {
        setNama(nama);
        setUkuran((int) ukuran);
    }
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }
    public boolean getBisaTerbang() {
        return bisaTerbang;
    }
    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }
    public String getJenisAves() {
        return jenisAves;
    }
    public void setTerbang(String terbang) {
        this.terbang = terbang;
    }
    public String getTerbang() {
        return terbang;
    }
}

class Ayam extends Aves {
    private String jenisAyam;
    private String adu;
    private boolean bisaDiadu;
    public Ayam() {
    }
    public Ayam(String nama, double ukuran) {
        super(nama, ukuran); 
    }
    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }
    public String getJenisAyam() {
        return jenisAyam;
    }
    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }
    public boolean getBisaDiadu() {
        return bisaDiadu;
    }
    public void setAdu(String adu) {
        this.adu = adu;
    }
    public String getAdu() {
        return adu;
    }
}

class Merpati extends Aves {
    public Merpati() {
    }
    public Merpati(String nama, double ukuran) {
        super(nama, ukuran); 
    }
    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        super.setBisaTerbang(bisaTerbang);
    }
    @Override
    public boolean getBisaTerbang() {
        return super.getBisaTerbang();
    }
}

public class tantangan {
    public static void main(String[] args) {
        System.out.println("IMPLEMENTASI INHERITANCE & POLYMORPHISM\n");

        Mamalia gajah = new Mamalia("Gajah Sumatera");
        gajah.setUkuran(300);
        gajah.setJenisMamalia("Herbivora");
        gajah.setJumlahKaki(4);
        gajah.setBisaJalan(true);

        System.out.println("1. Mamalia");
        System.out.println("   Nama       : " + gajah.getNama());
        System.out.println("   Jenis      : " + gajah.getJenisMamalia());
        System.out.println("   Jumlah Kaki: " + gajah.getJumlahKaki());

        Aves ayamJago = new Ayam("Ayam Jago", 15.5);
        ayamJago.setJenisAves("Unggas Darat");
        ((Ayam) ayamJago).setBisaDiadu(true); 
        ((Ayam) ayamJago).setJenisAyam("Bangkok");

        System.out.println("\n2. Aves (Objek Ayam)");
        System.out.println("   Nama       : " + ayamJago.getNama());
        System.out.println("   Ukuran     : " + ayamJago.getUkuran());
        System.out.println("   Jenis Ayam : " + ((Ayam) ayamJago).getJenisAyam());
        System.out.println("   Bisa Diadu : " + ((Ayam) ayamJago).getBisaDiadu());

        Merpati merpatiPos = new Merpati("Merpati Pos", 5.0);
        merpatiPos.setBisaTerbang(true);
        
        System.out.println("\n3. Aves (Objek Merpati)");
        System.out.println("   Nama       : " + merpatiPos.getNama());
        System.out.println("   Bisa Terbang: " + merpatiPos.getBisaTerbang());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}