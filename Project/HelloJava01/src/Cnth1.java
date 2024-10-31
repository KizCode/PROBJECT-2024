
import java.util.Scanner;

public class Cnth1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String pengarang; // Inisialisasi variabel pengarang
        String judul = "Layar Terkembang";
        int tinggiBadan = 63;
        double _health = 8.7;
        System.out.println(judul + " " + tinggiBadan + " " + _health);

        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Jam Sekarang : ");
        int jam = input.nextInt();
        if (jam >= 4 && jam < 10) {
            System.out.println("Selamat Pagi");
        } else if (jam >= 10 && jam < 14) {
            System.out.println("Selamat Siang");
        } else if (jam >= 14 && jam <= 18) {
            System.out.println("Selamat Sore");
        } else {
            System.out.println("Selamat Malam");
        }
    }
}
