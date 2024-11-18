import java.util.*;

class Pemilik {
    private String nama;
    private String alamat;
    private List<Mobil> daftarMobil; // Menyimpan daftar mobil pemilik

    // Konstruktor Pemilik
    public Pemilik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarMobil = new ArrayList<>();
    }

    // Method untuk membeli mobil
    public void beliMobil(Mobil mobil) {
        if (daftarMobil.size() < 5) {
            daftarMobil.add(mobil);
            System.out.println("Mobil dengan NoPlat " + mobil.getNoPlat() + " berhasil dibeli.");
        } else {
            System.out.println("Maksimal 5 mobil, tidak dapat membeli mobil baru.");
        }
    }

    // Method untuk menjual mobil
    public void jualMobil(String noPlat) {
        for (int i = 0; i < daftarMobil.size(); i++) {
            if (daftarMobil.get(i).getNoPlat().equals(noPlat)) {
                daftarMobil.remove(i);
                System.out.println("Mobil dengan NoPlat " + noPlat + " berhasil dijual.");
                return;
            }
        }
        System.out.println("Mobil dengan NoPlat " + noPlat + " tidak ditemukan.");
    }

    // Menampilkan informasi pemilik dan daftar mobil
    public void infoPemilik() {
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Alamat Pemilik: " + alamat);
        System.out.println("Daftar Mobil:");
        for (Mobil mobil : daftarMobil) {
            System.out.println(mobil);
        }
    }
}