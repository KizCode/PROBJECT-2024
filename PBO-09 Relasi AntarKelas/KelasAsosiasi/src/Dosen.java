class Dosen {
    private String Kddosen;
    private String[] nimMHS = new String[5];
    private int jmlMahasiswa = 0;

    public Dosen(String kode) {
        this.Kddosen = kode;
    }

    public void setKddosen(String Kddosen) {
        this.Kddosen = Kddosen;
    }

    public void setNimMahasiswa(String nim) {
        nimMHS[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }

    public int getJmlMahasiswa() {
        return this.jmlMahasiswa;
    }

    public String getKddosen() {
        return this.Kddosen;
    }

    public void daftarMahasiswa() {
        System.out.println("Kode Dosen: " + Kddosen);
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println(nimMHS[i]);
        }
    }
}
