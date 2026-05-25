class Lampu {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lampu menyala? " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lampu menyala? " + isOn);
    }
}

public class prak21 {
    public static void main(String[] args) {
        
        Lampu led = new Lampu();
        Lampu halogen = new Lampu();

        led.turnOn();
        halogen.turnOff();

        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}