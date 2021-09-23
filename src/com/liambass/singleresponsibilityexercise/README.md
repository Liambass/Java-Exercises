Given the following class, Car.java:
```
public class Car {
    private String colour;
    private String model;
    private int mileage;

    // constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
    }

    // getters and setters for colour and model

    // getter for mileage
    public int getMileage() {
        return mileage;
    }

    // setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // functionality
    public void drive(int milesDriven) {
        this.setMileage(this.getMileage() + milesDriven);
    }
}
```

implement the Single Responsibility Principle with a Driver.java class.

As a stretch goal, try adding a Mechanic.java class to this setup.



