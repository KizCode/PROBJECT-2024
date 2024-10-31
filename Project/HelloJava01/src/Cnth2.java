
import java.util.Scanner;

public class Cnth2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan NIM : ");
        String nim = input.nextLine();
        String prodi;
        switch (nim.substring(0,5)) {
            case "60701":
                prodi = "D3 Sistem Informasi";
                break;
            case "60702":
                prodi = "D3 Teknologi Telekomunikasi";
                break;
            case "60703":
                prodi = "D3 Perhotelan";
                break;
            default:
                prodi = "Prodi Tidak Ada";
                break;
        }
        System.out.print("Prodi : " + prodi);
    }
}
