class DriverMhsDosen {
    public static void main(String[] args) {
        /* kode di bawah ini merupakan implementasi dari hubungan asosiasi antar kelas */
        Mahasiswa mhs1 = new Mahasiswa("30108193", "Maulida Mazaya");
        Mahasiswa mhs2 = new Mahasiswa("30107999", "Imroatul Khuluqi Izzah");

        Dosen dsn = new Dosen("SKS");
        dsn.setNimMahasiswa(mhs1.getNim());
        dsn.setNimMahasiswa(mhs2.getNim());

        dsn.daftarMahasiswa();
    }
}
