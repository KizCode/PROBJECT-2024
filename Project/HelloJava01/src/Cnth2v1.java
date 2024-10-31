import java.util.Scanner;

class Cnth21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan NIM : ");
        String nim = input.nextLine();
        String prodi;
        switch (nim.substring(0,5)) {
            case "60701" -> prodi = "D3 Sistem Informasi";
            case "60702" -> prodi = "D3 Teknologi Telekomunikasi";
            case "60703" -> prodi = "D3 Perhotelan";
            default -> prodi = "Prodi Tidak Ada";
        }
        System.out.println("Prodi : " + prodi);
    }
}
