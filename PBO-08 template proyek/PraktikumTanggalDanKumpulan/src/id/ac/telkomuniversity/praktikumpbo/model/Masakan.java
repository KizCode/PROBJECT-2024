package id.ac.telkomuniversity.praktikumpbo.model;

public class Masakan {
    public String nama;
    public int harga;
    public KategoriMasakan kategori;

    public Masakan(String nama, int harga, KategoriMasakan kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
}
