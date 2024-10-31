public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    @Override
    public void accelarate(int speed) {
        System.out.println("Motorcycle is accelarating to " + speed + "km/h");
    }
}