import java.util.ArrayList;
import java.util.Scanner;

public class Lingkaran {
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> jariJari = new ArrayList<>();
        ArrayList<Double> luas = new ArrayList<>();
        ArrayList<Double> keliling = new ArrayList<>();

        System.out.print("Masukkan jumlah lingkaran: ");
        int jumlahLingkaran = scanner.nextInt();

        for (int i = 0; i < jumlahLingkaran; i++) {
            System.out.print("Masukkan jari-jari lingkaran ke-" + (i + 1) + ": ");
            double r = scanner.nextDouble();
            jariJari.add(r);
            luas.add(HitungLuas(r));
            keliling.add(HitungKeliling(r));
        }

        TampilkanHasil(jariJari, luas, keliling);
        scanner.close();
    }

    static double HitungLuas(double jariJari) {
        return PI * jariJari * jariJari;
    }

    static double HitungKeliling(double jariJari) {
        return 2 * PI * jariJari;
    }

    static void TampilkanHasil(ArrayList<Double> jariJari, ArrayList<Double> luas, ArrayList<Double> keliling) {
        System.out.println("\nHasil perhitungan:");
        System.out.println("No.\tJari-jari\tLuas\t\tKeliling");
        for (int i = 0; i < jariJari.size(); i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f%n", 
                              i + 1, jariJari.get(i), luas.get(i), keliling.get(i));
                              
        }
    }
}
