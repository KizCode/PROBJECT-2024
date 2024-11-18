public class MainKomp {
    public static void main(String args[]) {
        // bentuk objek laptop 1
        Laptop l1 = new Laptop("Asus", "A43S");
        l1.addKomponen(new CPU("Intel Core i7"), new VGA("Nvidia", 2));
        l1.displayData();

        // bentuk objek laptop 2
        Laptop l2 = new Laptop("Toshiba", "S006");
        l2.addKomponen(new CPU("Intel Core i5"), new VGA("Nvidia", 2));
        l2.displayData();
    }
}