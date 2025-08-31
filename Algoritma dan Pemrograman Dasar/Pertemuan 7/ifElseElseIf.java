public class ifElseElseIf {
    public static void main(String[] args) {
        int age = 20;

        if (age < 13) {
            System.out.println("Anda adalah seorang anak-anak.");
        } else if (age >= 13 && age < 20) {
            System.out.println("Anda adalah seorang remaja.");
        } else if (age >= 20 && age < 60) {
            System.out.println("Anda adalah seorang dewasa.");
        } else {
            System.out.println("Anda adalah seorang lansia.");
        }
    }
}