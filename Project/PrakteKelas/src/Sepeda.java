import java.util.Random;

public class Sepeda {
    String model;
    int warna;
    boolean pakaiLampu;
    // New fields
    float harga;
    int ukuranRoda;

    void setWarna(int warnaBaru){
        this.warna = warnaBaru;
    }

    void setHarga(float hargaBaru) {
        this.harga = hargaBaru;
    }
    
    void setUkuranSepeda(int ukuranBaru) {
        this.ukuranRoda = ukuranBaru;
    }

    void setPakaiLampu(boolean pakaiLampuBaru) {
        this.pakaiLampu = pakaiLampuBaru;

    }
    
    int generateNomorSeri(){
        Random random = new Random();
        return random.nextInt(1000000);
    }
}
