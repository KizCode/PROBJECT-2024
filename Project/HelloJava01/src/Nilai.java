import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai : ");
        int nilai = input.nextInt();
        String index;
        if ( nilai > 80) {
            index = "A";
        } else if ( nilai > 70) {
            index = "B";
        } else if (nilai > 60) {
            index = "C";
        } else if (nilai > 50 ) {
            index = "D";
        } else {
            index = "F";
        }
        System.out.println("Index Nilai : " + index);
    }
}
