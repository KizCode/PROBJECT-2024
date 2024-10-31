public class App {
    public static void main(String[] args) throws Exception {
        Person wira = new Person("Wira Perdana", 20, 40, 170);

        Sepeda s1 = new Sepeda();
        s1.model = "Polygon";
        s1.warna = 0x00ff00;
        s1.ukuranRoda = 20;
        s1.pakaiLampu = false;

        // Calculate and display BMI information for Wira
        double bmi = wira.hitungBMI();
        String kategori = wira.getKategoriBMI();
        
        System.out.println();
        System.out.println("BMI Wira: " + bmi);
        System.out.println("Kategori BMI: " + kategori);
        System.out.println();

        s1.setHarga(100000);   
        
        float pajak = (s1.harga * 11)/100;
        
        System.out.println("Harga sepeda: " + s1.harga);
        System.out.println("Pajak (11%): " + pajak);
        System.out.println("Total harga dengan pajak: " + (s1.harga + pajak));

        System.out.println(wira.getinfo() + " membeli sepeda " + s1.model);

        Tanggal mingguPagi = new Tanggal(2023, 5, 25); 

        Gowes gowesMingguPagi = new Gowes(wira, mingguPagi, s1, 10.5); 

        // Display information about the cycling activity
        // System.out.println("\nInformasi Gowes:");
        // System.out.println("Tanggal: " + gowesMingguPagi.getTanggal());
        // System.out.println("Pesepeda: " + gowesMingguPagi.getPesepeda().getinfo());
        // System.out.println("Sepeda: " + gowesMingguPagi.getSepeda().model);
        // System.out.println("Jarak: " + gowesMingguPagi.getJarak() + " km");

        System.out.println(gowesMingguPagi.pesepeda.nama);

        

    }
}
