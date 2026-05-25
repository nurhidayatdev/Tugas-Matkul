class trapesium {
    private int a, b, t;
    private double luasTrapesium;

    public void setAlasA(int a) {
        this.a = a;
    }

    public int getAlasA() {
        return a;
    }
    public void setAlasB(int b) {
        this.b = b;
    }

    public int getAlasB() {
        return b;
    }

    public void setTinggi(int t) {
        this.t = t;
    }

    public int getTinggi() {
        return t;
    }

    public void setLuasTrapesium(int a, int b, int t) {
        luasTrapesium = 0.5 * (a + b) * t;
    }
    public double getLuasTrapesium() {
        return luasTrapesium;
    }
}

class jajarGenjang {
    private int a, t;
    private double luasJajarGenjang;

    public void setAlas(int a) {
        this.a = a;
    }

    public int getAlas() {
        return a;
    }
    

    public void setTinggi(int t) {
        this.t = t;
    }

    public int getTinggi() {
        return t;
    }

    public void setLuasJajarGenjang(int a, int t) {
        luasJajarGenjang = a * t;
    }
    public double getLuasJajarGenjang() {
        return luasJajarGenjang;
    }
}

public class quiz {
    public static void main(String[] args) {
        trapesium tp = new trapesium();
        tp.setAlasA(5);
        tp.setAlasB(10);
        tp.setTinggi(5);
        tp.setLuasTrapesium(tp.getAlasA(), tp.getAlasB(), tp.getTinggi());

        System.out.println("Luas Trapesium :" + tp.getLuasTrapesium());

        jajarGenjang jg = new jajarGenjang();
        jg.setAlas(5);
        jg.setTinggi(5);
        jg.setLuasJajarGenjang(jg.getAlas(), jg.getTinggi());

        System.out.println("Luas Jajar Genjang :" + jg.getLuasJajarGenjang());
    }
}
