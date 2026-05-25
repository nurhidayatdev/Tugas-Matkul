public class enkapsulasiBiodata {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        bio.setNama("Nur Hidayat");
        bio.setNim("240209501052");
        bio.setJurusan("Teknik Informatika dan Komputer");
        bio.setFakultas("Fakultas Teknik");
        bio.setUniversitas("Universitas Negeri Makassar");
        bio.setAlamat("Paccinongan, Gowa");
        bio.setEmail("nurhidayat@gmail.com");
        bio.setHobi("Badminton");
        bio.setKeahlian("Web Development");

        bio.tampilBiodata();
    }
}