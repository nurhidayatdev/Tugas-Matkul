class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya Manusia");
    }
}

class Dosen extends Manusia {
    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur + " mengajar " + matakuliah);
    }
}

class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " mahasiswa di kelas " + kelas);
    }
}

public class praktikum41 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Fhatiah Adiba ");
        dosen.setUmur(30);
        dosen.setNip("0028079202");
        dosen.setMatakuliah("Pemrograman Lanjut");
        
        System.out.println("NIP dosen: " + dosen.getNip());
        dosen.mengajarApa();
        System.out.println();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Nur Hidayat");
        mahasiswa.setUmur(19);
        mahasiswa.setNim("240209501052");
        mahasiswa.setKelas("Sistem Cerdas");
        
        System.out.println("NIM mahasiswa: " + mahasiswa.getNim());
        mahasiswa.kelasApa();
    }
}