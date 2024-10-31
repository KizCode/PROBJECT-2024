public class Person {
    
    private String nama;
    private int umur;
    private double beratBadan;
    private int tinggi;

    Person(String nama, int umur, double beratBadan, int tinggi){
        this.nama = nama;
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggi = tinggi;

    }

    public double hitungBMI() {
        
        double tinggiMeter = this.tinggi / 100.0;
        double bmi = this.beratBadan / (tinggiMeter * tinggiMeter); 
        return Math.round(bmi * 100.0) / 100.0;
    }

    public String getKategoriBMI() {
        double bmi = hitungBMI();
        
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Gemuk";
        } else {
            return "Obesitas";
        }
    }

    String getinfo() {
        return(nama + " is " + umur + " old ");
    }
}
