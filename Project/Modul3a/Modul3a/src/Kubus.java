import java.util.Scanner;

public class Kubus {
    private double sisi;
    private double luas;
    private double volume;

    public Kubus(double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungVolume();
    }

    private void hitungLuas() {
        this.luas = 6 * sisi * sisi;
    }

    private void hitungVolume() {
        this.volume = sisi * sisi * sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungVolume();
    }

    public double getLuas() {
        return luas;
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        // Contoh penggunaan dengan input statis
        Kubus kubus = new Kubus(5);
        System.out.println("Sisi kubus: " + kubus.getSisi());
        System.out.println("Luas kubus: " + kubus.getLuas());
        System.out.println("Volume kubus: " + kubus.getVolume());

        // Untuk input dinamis.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        Kubus kubusDinamis = new Kubus(sisi);
        System.out.println("Luas kubus: " + kubusDinamis.getLuas());
        System.out.println("Volume kubus: " + kubusDinamis.getVolume());
        scanner.close();
    }
}


