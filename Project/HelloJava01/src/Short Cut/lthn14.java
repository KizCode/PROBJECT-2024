import java.util.Scanner;

public class lthn14 {
    public static void main(String [] args) {

    Scanner in = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);

    String m,n;
    int g,z,e,v;
    double brt,tng,jrt;
    double bmi,brc,brcp;

    System.out.println("");
    System.out.println("Program Penggabungan Switch Case dan if dalam java");
    System.out.println("1. Program Memilih Jurusan");
    System.out.println("2. Program Memilih Bulan");
    System.out.println("3. Program Menghitung Berat Badan Ideal");
    System.out.print("Masukan Pilihan : ");
    g = in.nextInt();
    if (g==1) {
        System.out.print("Masukan Nama : ");
        m = nm.nextLine();
        System.out.print("Masuakn NIM : ");
        n = nm.nextLine();

        System.out.println("Pilihan : ");
        System.out.println("1. Teknik Kendaraan Ringan Otomotif ");
        System.out.println("2. Teknik Bisnis Sepeda Motor");
        System.out.println("3. Teknik Rekayasa Perangkat Lunak");
        System.out.println("");
        System.out.print("Masukan Pilihan : ");
        z = in.nextInt();
        System.out.println("");
        
        switch (z) {
            case 1 :
                System.out.println(m + " Dengan NIM " + n + " Memilih Jurusan Teknik Kendaraan Ringan Otomotif" );
                break;
            case 2 :
                System.out.println(m + " Dengan NIM " + n + " Memilih Jurusan Teknik Bisnis Sepeda Motor" );
                break;
            case 3 :
                System.out.println(m + " Dengan NIM " + n + " Memilih Jurusan Teknik Rekayasa Perangkat Lunak" );
                break;
        }    
    } else if (g==2) {
        System.out.println("Pilihan : ");
        System.out.println("");
        System.out.println("1.  Januari");
        System.out.println("2.  Februari");
        System.out.println("3.  Maret");
        System.out.println("4.  April");
        System.out.println("5.  Mei");
        System.out.println("6.  Juni");
        System.out.println("7.  Juli");
        System.out.println("8.  Agustus");
        System.out.println("9.  September");
        System.out.println("10. Oktober");
        System.out.println("11. November");
        System.out.println("12. Desember");
        System.out.println("");
        System.out.print("Masukan Pilihan : ");
        e = in.nextInt();

        switch (e) {
            case 1 : 
                System.out.println("Anda Memlilih Bulan Januari");
                break;
            case 2 : 
                System.out.println("Anda Memlilih Bulan Februari");
                break;
            case 3 : 
                System.out.println("Anda Memlilih Bulan Maret");
                break;
            case 4 : 
                System.out.println("Anda Memlilih Bulan April");
                break;
            case 5 : 
                System.out.println("Anda Memlilih Bulan Mei");
                break;
            case 6 : 
                System.out.println("Anda Memlilih Bulan Juni");
                break;
            case 7 : 
                System.out.println("Anda Memlilih Bulan Juli");
                break;
            case 8 : 
                System.out.println("Anda Memlilih Bulan Agustus");
                break;
            case 9 : 
                System.out.println("Anda Memlilih Bulan September");
                break;
            case 10 : 
                System.out.println("Anda Memlilih Bulan Oktober");
                break;
            case 11 : 
                System.out.println("Anda Memlilih Bulan November");
                break;
            case 12 : 
                System.out.println("Anda Memlilih Bulan Desember");
                break;
        } 
    } else if (g==3) {
        System.out.println("Program Java Menghitung Berat Badan Ideal");
        System.out.println("-----------------------------------------");
        System.out.print("Masukan Jenis Klamin (1.Laki Laki) | (2.Perempuan) : ");
        v = in.nextInt();
        switch (v) {
            case 1 :
        System.out.print("Masukan Berat  : ");
        brt = in.nextDouble();
        System.out.print("Masukan Tinggi : ");
        tng = in.nextDouble();
        jrt = tng/100;
        brc = (tng-100)-(10/100*(tng-100));
        bmi = brt/jrt;
            if (bmi<18.5) {
                System.out.println ("BMI : " + bmi + " (Kurus)");
            } else if (bmi>18.5) {
                System.out.println ("BMI : " + bmi + " (Normal)");
            } else if (bmi<22.9) {
                System.out.println ("BMI : " + bmi + " (Normal)");
            } else if (bmi>23) {
                System.out.println ("BMI : " + bmi + " (Overweight)");
            } else if (bmi<24.9) {
                System.out.println ("BMI : " + bmi + " (Overweight)");
            } else if (bmi>=25) {
                System.out.println ("BMI : " + bmi + " (Obesitas)");
            }
            System.out.println("Berat Badan Ideal Anda (Menurut Rumus Broca) : "+ brc);
            break;
       
            case 2 :
        System.out.print("Masukan Berat  : ");
        brt = in.nextDouble();
        System.out.print("Masukan Tinggi : ");
        tng = in.nextDouble();
        jrt = tng/100;
        brcp = (tng-100)-(15/100*(tng-100));
        bmi = brt/jrt;
            if (bmi<18.5) {
                System.out.println ("BMI : " + bmi + " (Kurus)");
            } else if (bmi>18.5) {
                System.out.println ("BMI : " + bmi + " (Normal)");
            } else if (bmi<22.9) {
                System.out.println ("BMI :" + bmi + " (Normal)");
            } else if (bmi>23) {
                System.out.println ("BMI : " + bmi + " (Overweight)");
            } else if (bmi<24.9) {
                System.out.println ("BMI : " + bmi + " (Overweight)");
            } else if (bmi>=25) {
                System.out.println ("BMI : " + bmi + " (Obesitas)");
            }
            System.out.println("Berat Badan Ideal Anda (Menurut Rumus Broca) : "+ brcp);
            break;

            default :
            System.out.println("Pilihan Anda Tidak Ada");
        }    
        
        
    }
    
      

     
    }
}