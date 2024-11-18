public class MainAgregasi {
    public static void main(String[] args) {
        // Membentuk objek jurusan
        Jurusan j = new Jurusan("SI", "Sistem Informasi");

        // Membentuk objek mahasiswa
        Mhs m1 = new Mhs();
        m1.setNama("Berli Feriz Adam");
        m1.setNim("30108793");

        Mhs m2 = new Mhs();
        m2.setNama("Berli Feriz Adam");
        m2.setNim("30108397");

        j.addMhs(m1);
        j.addMhs(m2);

        System.out.println("Daftar mahasiswa " + j.getKode() + " adalah sebanyak " + j.getJumlahMhs() +
                " orang, dengan nama sebagai berikut:");
        System.out.println(m1.getNama());
        System.out.println(m2.getNama());
    }
}