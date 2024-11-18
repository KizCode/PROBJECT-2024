public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("Tech Solutions");

        Karyawan karyawan1 = new Karyawan("K001", "Alice");
        Karyawan karyawan2 = new Karyawan("K002", "Bob");

        perusahaan.tambahKaryawan(karyawan1);
        perusahaan.tambahKaryawan(karyawan2);

        perusahaan.daftarKaryawan();
    }
}