public class praktikum33 {
    public static void main(String args[]) 
    {
        enkapsulasi ob = new enkapsulasi();
        
        ob.setAlas(5);
        ob.setTinggi(7);
        
        System.out.println("Alas Segitiga : " + ob.getAlas());
        System.out.println("Tinggi Segitiga : " + ob.getTinggi());
        
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : " + ob.getLuasSegitiga());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}
