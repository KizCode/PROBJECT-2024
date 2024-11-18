package id.ac.telkomuniversity.praktikumpbo.service;

import java.time.LocalDateTime;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

import id.ac.telkomuniversity.praktikumpbo.model.ItemPesanan;
import id.ac.telkomuniversity.praktikumpbo.model.Pesanan;
import id.ac.telkomuniversity.praktikumpbo.model.StatusPesanan;


public class PemrosesPesanan {
    public Queue<ItemPesanan> antrianMasak = new ConcurrentLinkedQueue<>();

    public void masukkanAntrian(ItemPesanan pesanan) {
        // Implementasikan
    }
 
    public void hapus(ItemPesanan pesanan) {
        antrianMasak.remove(pesanan);
        pesanan.status = StatusPesanan.DIBATALKAN;
    }

    public void masakAntrianTerdepan() {
        ItemPesanan item = antrianMasak.poll();
        if (item != null) {
            System.out.println("Memasak " + item.masakan.nama + " pesanan " 
            + item.pesanan.pelanggan.nama);
            item.status = StatusPesanan.DIMASAK;

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 5000));
                item.status = StatusPesanan.SELESAI_DIMASAK;
                System.out.println("Selesai memasak" + item.masakan.nama + " pesanan " 
                + item.pesanan.pelanggan.nama);
                updatePesanan(item.pesanan);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updatePesanan(Pesanan pesanan) {
        boolean selesaiSemua = true;
        for (ItemPesanan item : pesanan.lisItem) {
            if (item.status == StatusPesanan.MASUK_ANTRIAN 
            || item.status == StatusPesanan.DIMASAK) {
                selesaiSemua = false;
            }
        }

        if (selesaiSemua) {
            pesanan.jamPesananSelesai = LocalDateTime.now();
        }
    }

    public boolean apakahOverload() {
        if (antrianMasak.size() > 30) {
            return true;
        }

        return false;
    }
}
