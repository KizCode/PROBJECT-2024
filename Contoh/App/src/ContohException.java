public class ContohException {
    public static void main(String[] args) {
        int d, a;
        try{
            d = 0;
            a = 42 / d;
            System.out.println("Tidak akan di print");
        } catch (ArithmeticException e){
            System.out.println("Pembagian oleh nol.");
        } finally {
            System.out.println("Cetak apapun yang terjadi");
        }]
    }
    
}
