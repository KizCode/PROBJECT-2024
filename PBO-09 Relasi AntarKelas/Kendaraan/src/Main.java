public class Main {
    public static void main(String[] args) {
        // Membuat objek Pemilik
        Pemilik pemilik = new Pemilik("John Doe", "Jl. Contoh No. 123");

        // Membuat beberapa objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "B1234XYZ", 2020);
        Mobil mobil2 = new Mobil("Honda", "B5678ABC", 2021);
        Mobil mobil3 = new Mobil("Suzuki", "B9101DEF", 2022);
        Mobil mobil4 = new Mobil("Daihatsu", "B1121GHI", 2023);
        Mobil mobil5 = new Mobil("Nissan", "B3141JKL", 2024);
        Mobil mobil6 = new Mobil("Mazda", "B4151MNO", 2025); // Mobil ke-6

        // Menguji beliMobil
        pemilik.beliMobil(mobil1);
        pemilik.beliMobil(mobil2);
        pemilik.beliMobil(mobil3);
        pemilik.beliMobil(mobil4);
        pemilik.beliMobil(mobil5);
        pemilik.beliMobil(mobil6); // Ini seharusnya gagal

        // Menampilkan informasi pemilik dan daftar mobil
        pemilik.infoPemilik();

        // Menguji jualMobil
        pemilik.jualMobil("B5678ABC");
        pemilik.jualMobil("B9999ZZZ"); // Mobil tidak ditemukan

        // Menampilkan informasi setelah penjualan
        pemilik.infoPemilik();
    }
}