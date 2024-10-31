public class Bus extends Vehicle {
    @Override
    public void type() {
        System.out.println("This Car Typr Bus");
    }
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopping");
    }
}
