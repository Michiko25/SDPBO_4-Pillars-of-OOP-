## 4 Pillars of OOP (Object-Oriented Programming)

### Abstraction and Encapsulation
```java
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
```
### Inheritance
Electric car
```java
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
```
Gas car
```java
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
```
### Polymorphism
```java
public class Main {
    public static void main(String[] args) throws Exception {
        // Polymorphism 
        // (car1 dan car2 objek dari class Car, tapi bisa memiliki perilaku yang berbeda)
        Car car1 = new ElectricCar("Tesla", "White");
        Car car2 = new GasCar("Toyota", "Black");

        car1.startEngine();
        car2.startEngine();
    }
}
```
