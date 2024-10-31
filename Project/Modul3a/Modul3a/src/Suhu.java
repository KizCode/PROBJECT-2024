import java.util.Scanner;

public class Suhu {
    private double celcius;
    private double reamur;
    private double fahrenheit;

    public Suhu() {
        // Default constructor
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
        konversiTanpaParameter();
    }

    public double getCelcius() {
        return celcius;
    }

    public double getReamur() {
        return reamur;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    // Prosedur tanpa parameter untuk melakukan konversi
    private void konversiTanpaParameter() {
        this.reamur = (4.0 / 5.0) * this.celcius;
        this.fahrenheit = (9.0 / 5.0) * this.celcius + 32;
    }

    // Prosedur dengan parameter untuk melakukan konversi
    public static void konversiDenganParameter(double celcius) {
        double reamur = (4.0 / 5.0) * celcius;
        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        System.out.println("Hasil konversi dengan parameter:");
        System.out.println("Reamur: " + reamur);
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suhu suhu = new Suhu();

        System.out.print("Masukkan suhu dalam Celcius: ");
        double inputCelcius = scanner.nextDouble();

        // Menggunakan prosedur tanpa parameter
        suhu.setCelcius(inputCelcius);
        System.out.println("Hasil konversi tanpa parameter:");
        System.out.println("Celcius: " + suhu.getCelcius());
        System.out.println("Reamur: " + suhu.getReamur());
        System.out.println("Fahrenheit: " + suhu.getFahrenheit());

        System.out.println();

        // Menggunakan prosedur dengan parameter
        konversiDenganParameter(inputCelcius);

        scanner.close();
    }
}

