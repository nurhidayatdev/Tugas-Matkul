public class ifElseIf {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println(number + " adalah angka positif.");
        } else if (number < 0) {
            System.out.println(number + " adalah angka negatif.");
        } else {
            System.out.println(number + " adalah nol.");
        }
    }
}