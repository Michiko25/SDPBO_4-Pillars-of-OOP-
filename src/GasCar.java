// Inheritance (subclass of Car)
class GasCar extends Car {
    public GasCar(String brand, String color) {
        super(brand, color);
    }

    @Override
    void startEngine() {
        System.out.println("Gas engine started with roar...");
    }
}
