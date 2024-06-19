public class UtilityVehicle extends Car {
        private boolean fourWheelDrive;

        public UtilityVehicle(String "4RG475859312345", String "Ford", String "Raptor", int 57000, boolean fourWheelDrive) {
                super(vinNumber, make, model, mileage);
                this.fourWheelDrive = fourWheelDrive;
        }

        @Override
        public String getInfo() {
                return super.getInfo() + ", Four-Wheel Drive: " + (fourWheelDrive ? "Yes" : "No");
        }
}

