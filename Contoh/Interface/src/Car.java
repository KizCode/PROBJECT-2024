public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car Accelerating to " + speed + " km/h");
    }
}
