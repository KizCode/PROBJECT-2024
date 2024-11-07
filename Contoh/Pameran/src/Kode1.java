import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kode1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Misal diketahui pameran IMOS diadakan tanggal 30 Okt hingga 3 Nov 2024
        LocalDate tanggalPembukaan = LocalDate.of(2024, 10, 30);
        LocalDate tanggalPenutupan = LocalDate.of(2024, 11, 3);

        // Maka durasi pameran adalah ...
        System.out.println("Durasi pameran: " +
            tanggalPembukaan.until(tanggalPenutupan).getDays() + " hari");

        // Contoh 2: menghitung umur seseorang
        LocalDate tglLahir = LocalDate.of(1975, 3, 15);
        System.out.println("Umur Pak Rudi adalah " +
            tglLahir.until(LocalDate.now(), ChronoUnit.YEARS) + " tahun");    
    }
}
