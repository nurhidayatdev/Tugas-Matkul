class Person {
    public void siapaKamu() {
        System.out.println("Saya adalah manusia");
    }
}
class Dosen extends Person {
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
class Mahasiswa extends Person {
    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}

public class contoh51 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.siapaKamu();      
        mahasiswa.siapaKamu();  

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}