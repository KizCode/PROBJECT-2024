import java.time.*;
import java.util.*;

public class Latihan1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // 1. Pilih interface yang sesuai.
        Set<LocalDateTime> jamDatangPegawai;

        // 2. Pilih kelas implementasi dari tabel sebelumnya.
        jamDatangPegawai = new HashSet<>();

        // 3. Panggil metode-metode yang ada pada interface untuk mengolah elemen.
        jamDatangPegawai.add(LocalDateTime.of(2024, 11, 4, 7, 53));
        jamDatangPegawai.add(LocalDateTime.of(2024, 11, 5, 7, 41));
        jamDatangPegawai.add(LocalDateTime.of(2024, 11, 6, 8, 15));

        // Hitung berapa kali pegawai tersebut terlambat (masuk lebih dari jam 8)!
        int telat = 0;
        for (LocalDateTime hariKerja : jamDatangPegawai) {
            if (hariKerja.getHour() >= 8) {
                telat++; // Tambah jumlah telat
                System.out.println("Pegawai terlambat pada: " + hariKerja);
            }
        }
        System.out.println("Total pegawai terlambat: " + telat);
    }
}

