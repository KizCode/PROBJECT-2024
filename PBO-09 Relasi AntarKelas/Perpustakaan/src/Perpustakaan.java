import java.util.*;

class Perpustakaan {
    private String namaPerpustakaan;
    private List<Buku> daftarBuku;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void daftarBuku() {
        System.out.println("Perpustakaan: " + namaPerpustakaan);
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getJudul() + " oleh " + buku.getPenulis());
        }
    }
}
