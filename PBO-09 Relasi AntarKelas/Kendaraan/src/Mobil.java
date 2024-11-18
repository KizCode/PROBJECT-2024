class Mobil {
    private String merek;
    private String noPlat;
    private int tahunKeluaran;

    // Konstruktor Mobil
    public Mobil(String merek, String noPlat, int tahunKeluaran) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }

    // Getter untuk noPlat
    public String getNoPlat() {
        return noPlat;
    }

    @Override
    public String toString() {
        return "Mobil [Merek=" + merek + ", NoPlat=" + noPlat + ", TahunKeluaran=" + tahunKeluaran + "]";
    }
}