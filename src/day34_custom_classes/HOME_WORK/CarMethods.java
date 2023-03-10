package day34_custom_classes.HOME_WORK;

public class CarMethods {


        String  model;
        int     year;
        String  color;
        double  fuelLevel;
        double  mileage;


        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    ", color='" + color + '\'' +
                    ", fuelLevel=" + fuelLevel +
                    ", mileage=" + mileage +
                    '}';
        }

        public void drive() {

            if (fuelLevel >= 5) {
                fuelLevel -= 5;
                System.out.println(model + " drive 5 miles");
                mileage += 5;
            } else {
                System.out.println("Tank is not enough. Car stopped");
            }
        }

        public void drive(int mile) {

            if (fuelLevel >= mile) {
                fuelLevel -= mile;
                System.out.println(model + " drive " + mile + " miles");
                mileage += mile;
            } else {
                System.out.println("Tank is not enough. Car stopped");
            }
        }


        public void fillTank() {
            fuelLevel = 85;
            System.out.println("Tank is full");
        }


        public void addGas(double value) {
            if ((fuelLevel + value) >= 100) {
                fuelLevel = 100;
            } else {
                fuelLevel += value;
            }

        }

        public boolean isLow() {
            if (fuelLevel <= 25) {
                return true;
            }
            return false;
        }


        public void changeColor(String newColor) {
            color = newColor;
        }

    }

