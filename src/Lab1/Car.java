package lab1;

class Car {

        private int horsepower;
        private double engineVolume;
        private String model;
        private int year;
        private String color;

        public Car(int horsepower, double engineVolume, String brand, String model, int year, String color) {
            this.horsepower = horsepower;
            this.engineVolume = engineVolume;
            this.model = model;
            this.year = year;
            this.color = color;
        }
     public double getEngineVolume() {
         return engineVolume;
     }

     public int getHorsepower() {
         return horsepower;
     }
 }


