public class Laptop {
    private String merk, tipe;
    private CPU cpu;
    private VGA vga;

    public Laptop(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }

    public void addKomponen(CPU cpu, VGA vga) {
        this.cpu = cpu;
        this.vga = vga;
    }

    public void displayData() {
        System.out.println("Laptop " + this.merk + " dengan tipe " + this.tipe);
        System.out.println("Punya spesifikasi:");
        System.out.println("- CPU: " + cpu.getNama());
        System.out.println("- VGA: " + vga.getNama() + " dengan kapasitas " + vga.getKapasitas() + "GB");
    }
}