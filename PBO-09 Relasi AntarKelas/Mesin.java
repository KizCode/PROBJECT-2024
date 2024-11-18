import java.io.*;

// Kelas Mesin (parent class)
class Mesin {
    private String namaMesin;

    public void setNamaMesin(String namaMesin) {
        this.namaMesin = namaMesin;
    }

    public String getNamaMesin() {
        return this.namaMesin + " adalah Mesin";
    }
}

// Kelas Mobil (child class)
class Mobil extends Mesin {
    private String tipeMobil;

    public Mobil(String namaMesin, String tipeMobil) {
        setNamaMesin(namaMesin); // Mengatur nama mesin
        this.tipeMobil = tipeMobil; // Mengatur tipe mobil
    }

    public String getTipeMobil() {
        return this.tipeMobil;
    }

    public void displayInfo() {
        System.out.println(getNamaMesin()); // Memanggil metode dari kelas induk
        System.out.println("Tipe Mobil: " + getTipeMobil());
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil = new Mobil("Mesin Toyota", "SUV");

        // Menampilkan informasi mobil
        mobil.displayInfo();
    }
}