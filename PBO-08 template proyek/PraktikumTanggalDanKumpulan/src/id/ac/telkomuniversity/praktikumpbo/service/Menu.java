package id.ac.telkomuniversity.praktikumpbo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import id.ac.telkomuniversity.praktikumpbo.model.KategoriMasakan;
import id.ac.telkomuniversity.praktikumpbo.model.Masakan;
import id.ac.telkomuniversity.praktikumpbo.model.UrutanMenu;

public class Menu {
    public List<Masakan> lisMasakan = new ArrayList<>();

    public void buatMenu() {
        lisMasakan.add(new Masakan("Mie Ayam Teriyaki", 30000, KategoriMasakan.HIDANGAN_UTAMA));
        lisMasakan.add(new Masakan("Nasi + Chicken Bulgogi", 29000, KategoriMasakan.HIDANGAN_UTAMA));
        lisMasakan.add(new Masakan("Fish Cake", 11000, KategoriMasakan.MAKANAN_RINGAN));
        lisMasakan.add(new Masakan("Siomay", 8000, KategoriMasakan.MAKANAN_RINGAN));
        lisMasakan.add(new Masakan("Jus Alpukat", 12000, KategoriMasakan.MINUMAN));
        lisMasakan.add(new Masakan("Jus Sirsak", 12000, KategoriMasakan.MINUMAN));
        lisMasakan.add(new Masakan("Es Lemon Tea", 12000, KategoriMasakan.MINUMAN));
    }

    /**
     * Mengubah urutan lis masakan
     * @param urutan
     */
    public void urutkanLisMasakan(UrutanMenu urutan) {
        switch (urutan) {
            case UrutanMenu.BERDASARKAN_NAMA:
                // Implementasikan pengurutan berdasarkan nama masakan di sini.
                break;

            case UrutanMenu.BERDASARKAN_KATEGORI:
                Collections.sort(lisMasakan, new Comparator<Masakan>() {

                    @Override
                    public int compare(Masakan arg0, Masakan arg1) {
                        return arg0.kategori.ordinal() - arg1.kategori.ordinal();
                    }
                });
                break;
        
            default:
                break;
        }
        System.out.println("MENU:");
        int i = 1;
        for (Masakan masakan : lisMasakan) {
            System.out.println(i++ + ". " + masakan.nama);   
        }
    }
}
