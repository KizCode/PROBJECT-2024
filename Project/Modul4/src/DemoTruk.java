public class DemoTruk {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan(5, 50.0, 10.0);
        Truk truk = new Truk(2, 100.0, 5.0, 2000.0);

        double jarak = 100.0;

        System.out.println("Kebutuhan BBM Kendaraan: " + kendaraan.kebutuhanBBM(jarak));
        System.out.println("Kebutuhan BBM Truk: " + truk.kebutuhanBBM(jarak));

        // Cetak atribut
        System.out.println("Jumlah Penumpang Kendaraan: " + kendaraan.getJumlahPenumpang());
        System.out.println("Kapasitas BBM Kendaraan: " + kendaraan.getKapasitasBBM());
        System.out.println("Konsumsi BBM Kendaraan: " + kendaraan.getKonsumsiBBM());
    }
}