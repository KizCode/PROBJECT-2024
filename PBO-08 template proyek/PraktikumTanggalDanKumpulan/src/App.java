import id.ac.telkomuniversity.praktikumpbo.model.ItemPesanan;
import id.ac.telkomuniversity.praktikumpbo.model.Pelanggan;
import id.ac.telkomuniversity.praktikumpbo.model.Pesanan;
import id.ac.telkomuniversity.praktikumpbo.model.Transaksi;
import id.ac.telkomuniversity.praktikumpbo.model.UrutanMenu;
import id.ac.telkomuniversity.praktikumpbo.service.Menu;
import id.ac.telkomuniversity.praktikumpbo.service.PemrosesPesanan;

public class App {
    public static void main(String[] args) throws Exception {
        PemrosesPesanan pemrosesPesanan = new PemrosesPesanan();

        Menu m = new Menu();
        m.buatMenu();
        m.urutkanLisMasakan(UrutanMenu.BERDASARKAN_NAMA);

        Pelanggan pakMamat = new Pelanggan("Mamat", null);
        Pesanan pesanan1 = new Pesanan(pakMamat);
        pesanan1.tambah(new ItemPesanan(pesanan1, m.lisMasakan.get(2), 1));
        pesanan1.tambah(new ItemPesanan(pesanan1, m.lisMasakan.get(5), 1));
        pesanan1.tambah(new ItemPesanan(pesanan1, m.lisMasakan.get(0), 2));
        pesanan1.tambah(new ItemPesanan(pesanan1, m.lisMasakan.get(6), 1));
        pemrosesPesanan.antrianMasak.addAll(pesanan1.lisItem);

        while (!pemrosesPesanan.antrianMasak.isEmpty()) {
            pemrosesPesanan.masakAntrianTerdepan();
        }

        System.out.println("Lama penyajian: " + pesanan1.lamaPenyajian().getSeconds() + " detik");
        
        Transaksi transaksi1 = new Transaksi();
        transaksi1.pesanan = pesanan1;
        System.out.println("Total harga: " + transaksi1.hitungHarga());
        transaksi1.tutupTransaksi();
        System.out.println("Transaksi selesai. Terima kasih.");
    }
}
