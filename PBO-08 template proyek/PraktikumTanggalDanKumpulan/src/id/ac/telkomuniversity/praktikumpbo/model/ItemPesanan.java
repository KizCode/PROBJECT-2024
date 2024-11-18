package id.ac.telkomuniversity.praktikumpbo.model;

public class ItemPesanan {
    public Pesanan pesanan;
    public Masakan masakan;
    public int jumlah;
    public StatusPesanan status;

    public ItemPesanan(Pesanan pesanan, Masakan masakan, int jumlah) {
        this.pesanan = pesanan;
        this.masakan = masakan;
        this.jumlah = jumlah;
        this.status = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pesanan == null) ? 0 : pesanan.hashCode());
        result = prime * result + ((masakan == null) ? 0 : masakan.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPesanan other = (ItemPesanan) obj;
        if (pesanan == null) {
            if (other.pesanan != null)
                return false;
        } else if (!pesanan.equals(other.pesanan))
            return false;
        if (masakan == null) {
            if (other.masakan != null)
                return false;
        } else if (!masakan.equals(other.masakan))
            return false;
        return true;
    }
}
