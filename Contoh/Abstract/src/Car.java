public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopping");
    }
}
