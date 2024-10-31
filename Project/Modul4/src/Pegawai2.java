public class Pegawai2 {
    private String nama, nip;

    public Pegawai2() {
        this.nip = "0";
        this.nama = "Tidak bernama";
    }

    public Pegawai2(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void printPegawai() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("NIP Pegawai: " + this.nip);
    }

    public static void main(String[] args) {
        Pegawai2 pegawai1 = new Pegawai2();
        Pegawai2 pegawai2 = new Pegawai2("Joko", "p001");

        pegawai1.printPegawai();
        pegawai2.printPegawai();
    }
}
