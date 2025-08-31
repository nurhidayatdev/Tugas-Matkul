public class switchCase {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1 -> System.out.println("Hari ini adalah Senin.");
            case 2 -> System.out.println("Hari ini adalah Selasa.");
            case 3 -> System.out.println("Hari ini adalah Rabu.");
            case 4 -> System.out.println("Hari ini adalah Kamis.");
            case 5 -> System.out.println("Hari ini adalah Jumat.");
            case 6 -> System.out.println("Hari ini adalah Sabtu.");
            case 7 -> System.out.println("Hari ini adalah Minggu.");
            default -> System.out.println("Hari tidak valid.");
        }
    }
}