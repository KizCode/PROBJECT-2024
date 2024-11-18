import java.util.ArrayList;
import java.util.List;

// Kelas Rekening
class Rekening {
    private String noRekening;
    private double saldo;

    // Konstruktor Rekening
    public Rekening(String noRekening, double saldoAwal) {
        this.noRekening = noRekening;
        this.saldo = saldoAwal;
    }

    // Method untuk deposit
    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Deposit: " + jumlah + ", Saldo sekarang: " + saldo);
    }

    // Method untuk withdraw
    public void withdraw(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Withdraw: " + jumlah + ", Saldo sekarang: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk withdraw: " + jumlah);
        }
    }

    // Getter untuk noRekening
    public String getNoRekening() {
        return noRekening;
    }

    // Getter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Rekening [NoRekening=" + noRekening + ", Saldo=" + saldo + "]";
    }
}

// Kelas Nasabah
class Nasabah {
    private String nama;
    private String alamat;
    private List<Rekening> rek; // Menyimpan daftar rekening

    // Konstruktor Nasabah
    public Nasabah(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.rek = new ArrayList<>();
    }

    // Method untuk membuka rekening
    public void bukaRekening(String noRekening, double saldoAwal) {
        if (rek.size() < 5) {
            Rekening rekeningBaru = new Rekening(noRekening, saldoAwal);
            rek.add(rekeningBaru);
            System.out.println("Rekening baru berhasil dibuka: " + noRekening);
        } else {
            System.out.println("Maksimal 5 rekening, tidak dapat membuka rekening baru.");
        }
    }

    // Menampilkan informasi nasabah dan rekening
    public void infoNasabah() {
        System.out.println("Nama Nasabah: " + nama);
        System.out.println("Alamat Nasabah: " + alamat);
        System.out.println("Daftar Rekening:");
        for (Rekening rekening : rek) {
            System.out.println(rekening);
        }
    }
}

// Kelas Tester
public class Main {
    public static void main(String[] args) {
        // Membuat objek Nasabah
        Nasabah nasabah = new Nasabah("Alice Smith", "Jl. Contoh No. 456");

        // Membuka rekening
        nasabah.bukaRekening("123456789", 1000.0);
        nasabah.bukaRekening("987654321", 2000.0);
        nasabah.bukaRekening("555555555", 1500.0);
        nasabah.bukaRekening("111111111", 3000.0);
        nasabah.bukaRekening("222222222", 2500.0);
        nasabah.bukaRekening("333333333", 500.0); // Ini seharusnya gagal

        // Menampilkan informasi nasabah dan rekening
        nasabah.infoNasabah();

        // Melakukan deposit dan withdraw
        nasabah.rek.get(0).deposit(500.0); // Deposit ke rekening pertama
        nasabah.rek.get(1).withdraw(1000.0); // Withdraw dari rekening kedua
        nasabah.rek.get(2).withdraw(2000.0); // Withdraw dari rekening ketiga (saldo tidak cukup)

        // Menampilkan informasi setelah transaksi
        nasabah.infoNasabah();
    }
}