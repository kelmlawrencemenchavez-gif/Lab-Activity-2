
public class motorcycle extends vehicle {

    private String transmissionType;

    public motorcycle(String brand, int year, String model, String transmissionType) {
        super(brand, year, model);
        this.transmissionType = transmissionType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println();
    }

    @Override
    public void moveForward() {
        System.out.println("The motor moved forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The motor moved backwards");
    }

    @Override
    public void moveRight() {
        System.out.println("The motor moved right");
    }

    @Override
    public void moveLeft() {
        System.out.println("The motor moved left");
    }
}
