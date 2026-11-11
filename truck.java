
public class truck extends vehicle {

    private int numberOfDoors;

    public truck(String brand, int year, String model, int numberOfDoors) {
        super(brand, year, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
        System.out.println();
    }

    @Override
    public void moveForward() {
        System.out.println("The truck moved forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The truck moved backwards");
    }

    @Override
    public void moveRight() {
        System.out.println("The truck moved right");
    }

    @Override
    public void moveLeft() {
        System.out.println("The truck moved left");
    }
}
