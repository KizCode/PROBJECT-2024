public class Truk extends Kendaraan {
    private double kapasitasKargo;

    public Truk(int jumlahPenumpang, double kapasitasBBM, double konsumsiBBM, double kapasitasKargo) {
        super(jumlahPenumpang, kapasitasBBM, konsumsiBBM);
        this.kapasitasKargo = kapasitasKargo;
    }

    @Override
    public double kebutuhanBBM(double jarakTempuh) {
        return (jarakTempuh / getKonsumsiBBM()) + (kapasitasKargo / 10);
    }

    public double getKapasitasKargo() {
        return kapasitasKargo;
    }

    public void setKapasitasKargo(double kapasitasKargo) {
        this.kapasitasKargo = kapasitasKargo;
    }
}