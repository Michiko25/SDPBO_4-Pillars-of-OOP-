// Inheritance (subclass of Car)
class ElectricCar extends Car {
    public ElectricCar(String brand, String color) {
        super(brand, color);
    }

    @Override // metode tumpuk
    void startEngine() {
        System.out.println("Electric engine motor started silently...");
    }
}