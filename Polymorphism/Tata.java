public class Tata extends Car {

    public Tata(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Tata Safari started");
    }

    @Override
    public void accelerate() {
        System.out.println("Tata Safari Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Tata Safari stopped, Brakes applied");
    }

}
