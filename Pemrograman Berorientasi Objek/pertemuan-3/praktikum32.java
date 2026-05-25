class atas {
    public int a;
    protected int b;
    private String alamat;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String tempString) {
        alamat = tempString;
    }
}

public class praktikum32 {
    public static void main(String[] args) {
        atas objek = new atas();
        objek.a = 2;
        objek.b = 3;
        
        objek.setAlamat("Makassar");

        System.out.println("Nilai a : " + objek.a);
        System.out.println("Nilai b : " + objek.b);
        
        System.out.println("Alamat  : " + objek.getAlamat());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}
