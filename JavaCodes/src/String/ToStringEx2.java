package String;

public class ToStringEx2 {
    private String make;
    private String model;
    private int year;

    public ToStringEx2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        // Create a Car object
        ToStringEx2 myCar = new ToStringEx2("Toyota", "Camry", 2020);

        // Print the Car object
        System.out.println("My Car: " + myCar.toString());
    }
}

