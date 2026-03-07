// Abstraction
abstract class Car {
    protected String brand;
    protected String color;

    public Car (String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

     // Encapsulation
    private int speed;

    public void setSpeed (int speed) {
        if (speed >= 0){
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    abstract void startEngine();

    public void displayinfo(){
        System.out.println("Brand:" + brand + "Color:" + color);
    }
}

