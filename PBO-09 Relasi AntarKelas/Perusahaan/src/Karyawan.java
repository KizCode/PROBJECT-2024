class Karyawan {
    private String nama;
    private String idKaryawan;

    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }
}
