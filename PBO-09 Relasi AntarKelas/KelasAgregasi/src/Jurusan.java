public class Jurusan {
    private String kode, nama;
    private Mhs daftarMhs[] = new Mhs[10];
    private int jumlahMhs;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlahMhs() {
        return this.jumlahMhs;
    }

    public void addMhs(Mhs m) {
        if (jumlahMhs < this.daftarMhs.length) {
            daftarMhs[jumlahMhs] = m;
            jumlahMhs++;
        }
    }

    public Mhs[] getDaftarMhs() {
        return this.daftarMhs;
    }
}