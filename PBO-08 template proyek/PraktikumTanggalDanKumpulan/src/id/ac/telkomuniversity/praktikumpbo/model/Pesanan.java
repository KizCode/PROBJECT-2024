package id.ac.telkomuniversity.praktikumpbo.model;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class Pesanan {
    public int id;
    public Pelanggan pelanggan;
    public Set<ItemPesanan> lisItem = new HashSet<>();


    
    public Pesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambah(ItemPesanan item) {
        if (!lisItem.contains(item)) {
            lisItem.add(item);
        } else {
            lisItem.remove(item);
            lisItem.add(item);
        }
    }

    public void hapus(ItemPesanan item) {
        lisItem.remove(item);
    }

    public Duration lamaPenyajian() {
        // Implementasikan
        return null;
    }
}
