class Bangundatar {
    public void luasPersegi(float panjangSisi) {
        float luas = panjangSisi * panjangSisi;
        System.out.println("Luas persegi adalah: " + luas);
    }

    public void luasPersegiPanjang(float panjang, float lebar) {
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}

class Bangunruang {
    public void volumeKubus(float panjangSisi) {
        float volume = panjangSisi * panjangSisi * panjangSisi;
        System.out.println("Volume kubus adalah: " + volume);
    }

    public void volumeBalok(float panjang, float lebar, float tinggi) {
        float volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume + "\n");
    
    }
}

public class prak23 {
    public static void main(String[] args) {
        Bangunruang kubus = new Bangunruang();
        kubus.volumeKubus(5.0f);

        Bangundatar persegipanjang = new Bangundatar();
        persegipanjang.luasPersegiPanjang(5.0f, 2.0f);
        
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}