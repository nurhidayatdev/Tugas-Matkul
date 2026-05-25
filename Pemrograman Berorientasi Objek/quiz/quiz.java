class honda {
    String a = "Brio";
    String b = "Jess";
    String c = "Civic";
}
class toyota {
    String d = "Avansa";
    String e = "Canry";
    String f = "Carola";
}
class daihatsu {
    String g = "Ayla";
    String h = "Xenia";
    String i = "Terios";
}

public class quiz {
    public static void main(String[] args) {
        honda x1 = new honda();
        honda x2 = new honda();
        honda x3 = new honda();

        toyota y1 = new toyota();
        toyota y2 = new toyota();
        toyota y3 = new toyota();

        daihatsu z1 = new daihatsu();
        daihatsu z2 = new daihatsu();
        daihatsu z3 = new daihatsu();

        System.out.println(x1.a);
        System.out.println(x2.b);
        System.out.println(x3.c);

        System.out.println(y1.d);
        System.out.println(y2.e);
        System.out.println(y3.f);

        System.out.println(z1.g);
        System.out.println(z2.h);
        System.out.println(z3.i);
    }
}
