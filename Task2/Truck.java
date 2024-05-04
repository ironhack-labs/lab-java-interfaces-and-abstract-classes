package Task2;

public class Truck extends Car{
    double towingCapacity = 1000;

    @Override
    String getInfo() {
        var startingMessage = super.getInfo();
        return startingMessage + "\nTowing Capacity is: " + towingCapacity;
    }
}
