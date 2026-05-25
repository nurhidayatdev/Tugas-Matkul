abstract class Hewan { 
    public abstract void suara(); 
 
    public void tidur() { 
        System.out.println("Hewan ini sedang tidur."); 
    } 
} 
class Kucing extends Hewan { 
    public void suara() { 
        System.out.println("Meong Meong"); 
    } 
} 
 
public class contoh61 { 
    public static void main(String[] args) { 
        Kucing kucing = new Kucing(); 
        kucing.suara();  
        kucing.tidur();  
        
        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    } 
}