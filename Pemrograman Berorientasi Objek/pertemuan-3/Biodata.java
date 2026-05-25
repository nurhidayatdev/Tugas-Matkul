public class Biodata {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String hobi;
    private String keahlian;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public void tampilBiodata() {
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Fakultas    : " + fakultas);
        System.out.println("Universitas : " + universitas);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Email       : " + email);
        System.out.println("Hobi        : " + hobi);
        System.out.println("Keahlian    : " + keahlian);
    }
}