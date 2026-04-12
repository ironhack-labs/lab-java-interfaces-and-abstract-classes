package com.ironhack.lab.exercise2;

    //Clase abstracta para los modelos de coche
    public abstract class Car{
        private String vinNumber;
        private String make;
        private String model;
        private int mileage;

        //Cpnstructor de la clase abtracta Car

        public Car(String vinNumber, String make, String model, int mileage) {
            this.vinNumber = vinNumber;
            this.make = make;
            this.model = model;
            this.mileage = mileage;
        }

        //Metodo getInfo
        public String getInfo() {
            return "VIN Number: " + vinNumber +
                    ", Make: " + make +
                    ", Model: " + model +
                    ", Mileage: " + mileage;
        }
        //Getters de la clase

        public String getVinNumber() {
            return vinNumber;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getMileage() {
            return mileage;
        }

        //toString()

        @Override
        public String toString() {
            return getInfo();
        }
    }


