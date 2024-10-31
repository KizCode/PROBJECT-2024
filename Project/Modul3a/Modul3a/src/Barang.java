import java.util.Scanner;

public class Barang {
    public String nama;  // Atribut dengan akses public
    private double harga;  // Atribut dengan akses private
    int stok;  // Atribut dengan akses default

    // Konstruktor dengan parameter
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

   
    public double getHarga() {
        return harga;
    }

   
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok barang: ");
        int stok = scanner.nextInt();

        Barang barang = new Barang(nama, harga, stok);

        System.out.println("\nInformasi Barang:");
        barang.tampilkanInfo();

        // Menunjukkan perbedaan penggunaan atribut dengan 3 akses yang berbeda
        System.out.println("\nPenggunaan atribut dengan akses berbeda:");
        System.out.println("1. Public   - Nama dapat diakses langsung: " + barang.nama);
        System.out.println("2. Private  - Harga diakses melalui getter: " + barang.getHarga());
        System.out.println("3. Default  - Stok dapat diakses dalam package: " + barang.stok);

        scanner.close();
    }
}

