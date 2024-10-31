public class Kendaraan {
    private int jumlahPenumpang;
    private double kapasitasBBM;
    private double konsumsiBBM;

    public Kendaraan(int jumlahPenumpang, double kapasitasBBM, double konsumsiBBM) {
        this.jumlahPenumpang = jumlahPenumpang;
        this.kapasitasBBM = kapasitasBBM;
        this.konsumsiBBM = konsumsiBBM;
    }

    public double jarak() {
        return kapasitasBBM * konsumsiBBM;
    }

    public double kebutuhanBBM(double jarakTempuh) {
        return jarakTempuh / konsumsiBBM;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public double getKapasitasBBM() {
        return kapasitasBBM;
    }

    public void setKapasitasBBM(double kapasitasBBM) {
        this.kapasitasBBM = kapasitasBBM;
    }

    public double getKonsumsiBBM() {
        return konsumsiBBM;
    }

    public void setKonsumsiBBM(double konsumsiBBM) {
        this.konsumsiBBM = konsumsiBBM;
    }
}
