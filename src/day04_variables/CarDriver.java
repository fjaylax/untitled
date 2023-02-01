package day04_variables;

public class CarDriver {
    public static void main(String[] args) {
        String DriverName = "John";
        String CarModel = "Ford";
        String LicensePlate = "12345";
        String LicenseClass = "TRK";
        int speed = 125;
        boolean isAutomatic = true;
        System.out.println("The driver of the "+CarModel+ " is " +DriverName+". License plate:" +
                "" +LicensePlate+ ". Even his License Class is \"" +LicenseClass+ "\"  " +
                "he is still was able to qualify for the race. He might has" +
                " slight advantage because his car is automatic: " +isAutomatic+".");
    }
}
