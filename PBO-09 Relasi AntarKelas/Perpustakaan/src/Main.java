public class Main {
    public static void main(String[] args) {
     
        Buku buku1 = new Buku("Belajar Java", "John Doe");
        Buku buku2 = new Buku("Pemrograman Berorientasi Objek", "Jane Smith");


        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kota");


        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);


        perpustakaan.daftarBuku();


        System.out.println("Buku: " + buku1.getJudul() + " masih ada tanpa perpustakaan.");
    }
}