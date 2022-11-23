public class Maruti extends Car {

    public Maruti(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Maruti Alto started");
    }

    @Override
    public void accelerate() {
        System.out.println("Maruti Alto Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Maruti Alto stopped, Brakes applied");
    }

}
