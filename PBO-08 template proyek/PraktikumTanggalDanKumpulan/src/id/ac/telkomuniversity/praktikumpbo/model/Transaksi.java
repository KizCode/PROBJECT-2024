package id.ac.telkomuniversity.praktikumpbo.model;

import java.time.LocalDateTime;

public class Transaksi {
    public int id;
    public Pesanan pesanan;
    public double diskon;
    public LocalDateTime tanggal;

    public int hitungHarga() {
        // Implementasikan
        return 0;
    }

    public void tutupTransaksi() {
        // Implementasikan
    }
}
