package Car;

public class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo() {
        return String.format("VIN: %s, Marca: %s, Modello: %s, Chilometraggio: %d km",
                vinNumber, make, model, mileage);
    }

    // Getter e Setter possono essere aggiunti qui se necessario
}

