
public class Main {

    public static void printAll(vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void printMovement(vehicle vehicle) {
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) {

        vehicle[] washu = {
            new car("Toyota", 2020, "Vios", 4),
            new motorcycle("Honda", 2022, "Click", "Automatic"),
            new truck("Nissan", 2010, "Frontier", 4)
        };

        for (vehicle coll : washu) {
            printAll(coll);
            printMovement(coll);
            System.out.println();
        }
    }
}
