package id.ac.telkomuniversity.praktikumpbo.model;

public class Pelanggan {
    public String nama = "anonim";
    public String noTelp = null;

    public Pelanggan(String nama, String noTelp) {
        if (nama != null) {
            this.nama = nama;
        }
        
        this.noTelp = noTelp;
    }
}
