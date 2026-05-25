class binatang {
    int umur = 12;

    int get_umur() {
        return umur; 
    }
}
class herbivora extends binatang {
    @Override 
    int get_umur() {
        return super.get_umur(); 
    }

    public static void main(String[] args) {
        herbivora h = new herbivora();
        System.out.println(h.get_umur());
        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}