public class Main {
    public static void main(String[] args) throws Exception {

        // Car myCar = new Car();
        // Car myHonda = new Car("Honda", "yellow", "Brio", 150);

        // System.out.println(myHonda.getBrand());

        // Polymorphism 
        // (car1 dan car2 objek dari class Car, tapi bisa memiliki perilaku yang berbeda)
        Car car1 = new ElectricCar("Tesla", "White");
        Car car2 = new GasCar("Toyota", "Black");

        car1.startEngine();
        car2.startEngine();
    }
}