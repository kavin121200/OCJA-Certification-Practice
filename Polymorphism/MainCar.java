import java.util.Scanner;

public class MainCar {

    public static void main(String[] args) {

        Car car ;
        System.out.println("Functions of a Car: ");
        (new Car()).startEngine();
        (new Car()).accelerate();
        (new Car()).brake();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Hyundai creta\n2-Maruti Alto\n3-Tata Safari");
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();

        switch(ch) {

            case 1: car = new Hyundai("Creta", 4);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 2: car = new Maruti("Alto", 2);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 3: car = new Tata("Safari", 6);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

                default:
                    System.out.println("Enter Valid Choice.");

        }

    }

}
