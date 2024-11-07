import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Kode2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Contoh 3: menghitung jam deadline ujian
        LocalTime jamMulai = LocalTime.of(8, 41, 24);
        long durasi = 180;
        System.out.println("Deadline pengumpulan ujian: " + jamMulai.plusMinutes(durasi));

        // Bagaimana cara men-set jamMulai menjadi waktu saat ini?
    }
}
