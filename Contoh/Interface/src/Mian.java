public class Mian {
    public static void main(String[] args) throws Exception {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        myCar.start();
        myCar.accelerate(100);
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.accelerate(80);
        myMotorcycle.stop();
    }
}
