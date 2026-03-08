## 4 Pillars of OOP

Object-Oriented Programming (OOP), dirancang untuk meningkatkan modularitas, kemudahan pemeliharaan, dan skalabilitas dalam pengembangan perangkat lunak dengan menyembunyikan kompleksitas, membungkus data, dan memungkinkan penggunaan kembali kode
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
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
