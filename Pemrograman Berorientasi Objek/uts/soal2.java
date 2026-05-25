class balok {
    private int p, l, t;
    private double luasbalok, volumebalok;
    public void setPanjang(int p) {
        this.p = p;
    }
    public int getPanjang() {
        return p;
    }
    public void setLebar(int l) {
        this.l = l;
    }
    public int getLebar() {
        return l;
    }
    public void setTinggi(int t) {
        this.t = t;
    }
    public int getTinggi() {
        return t;
    }
    public void setLuasbalok(int p, int l, int t) {
        luasbalok = p * l;
    }
    public double getLuasbalok() {
        return luasbalok;
    }
    public void setVolumebalok(int p, int l, int t) {
        volumebalok = p * l * t;
    }
    public double getVolumebalok() {
        return volumebalok;
    }
}

class kubus {
    private int s;
    private double luaskubus, volumekubus;
    public void setSisi(int s) {
        this.s = s;
    }
    public int getSisi() {
        return s;
    }
    public void setLuaskubus(int s) {
        luaskubus = s * s;
    }
    public double getLuaskubus() {
        return luaskubus;
    }
    public void setVolumekubus(int s) {
        volumekubus = s * s * s;
    }
    public double getVolumekubus() {
        return volumekubus;
    }
}

public class soal2 {
    public static void main(String[] args) {
        balok bk = new balok();
        bk.setPanjang(5);
        bk.setLebar(10);
        bk.setTinggi(5);
        bk.setLuasbalok(bk.getPanjang(), bk.getLebar(), bk.getTinggi());
        bk.setVolumebalok(bk.getPanjang(), bk.getLebar(), bk.getTinggi());

        System.out.println("Luas Balok :" + bk.getLuasbalok());
        System.out.println("Volume Balok :" + bk.getVolumebalok());
        System.out.println("-----------------");
        kubus ks = new kubus();
        ks.setSisi(5);
        ks.setLuaskubus(ks.getSisi());
        ks.setVolumekubus(ks.getSisi());

        System.out.println("Luas Kubus :" + ks.getLuaskubus());
        System.out.println("Volume Kubus :" + ks.getVolumekubus());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}
