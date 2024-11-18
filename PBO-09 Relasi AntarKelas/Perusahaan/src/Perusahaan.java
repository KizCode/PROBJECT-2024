import java.util.ArrayList;
import java.util.List;

class Perusahaan {
    private String namaPerusahaan;
    private List<Karyawan> karyawanList;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.karyawanList = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    public void daftarKaryawan() {
        System.out.println("Perusahaan: " + namaPerusahaan);
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : karyawanList) {
            System.out.println(karyawan.getIdKaryawan() + " - " + karyawan.getNama());
        }
    }
}
