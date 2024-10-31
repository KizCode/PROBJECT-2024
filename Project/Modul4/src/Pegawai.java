public class Pegawai {
    private String nama, nip;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public Pegawai(String nama, String nip) {
        this.nip = nip;
        this.nama = nama;
    }

    public void printPegawai() {
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("NIP Pegawai: " + this.nip);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Joko", "p000");
        Pegawai pegawai2 = new Pegawai("p001", "Widodo");

        pegawai1.printPegawai();
        pegawai2.printPegawai();
    }
}
