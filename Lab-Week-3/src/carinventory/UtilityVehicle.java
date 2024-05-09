package carinventory;

public class UtilityVehicle extends Car {
      private boolean isFourWheelDrive;

      public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean isFourWheelDrive) {
          this.vinNumber = vinNumber;
          this.make = make;
          this.model = model;
          this.mileage = mileage;
          this.isFourWheelDrive = isFourWheelDrive;
      }

    @Override
    public String toString() {
        return "UtilityVehicle{" +
                "isFourWheelDrive=" + isFourWheelDrive +
                ", vinNumber='" + vinNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
