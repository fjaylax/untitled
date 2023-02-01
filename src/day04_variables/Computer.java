package day04_variables;

public class Computer<L> {
    public static void main(String[] args) {


        String brand = "Dell Inspiron";
        String cpu = "12th Gen Intel(R) Core(TM) i7-1255U 1.70 GHz";
        int ram = 16;
        int storageMemory = 458;
        boolean hasmonitor = false;
        boolean hasWIFIcard = true;
        double price = 1150.55;
        int usb = 4;
        boolean hasBluetooth = true;

        System.out.println("Today is for sale: \n"+brand+ ". Very popular and best selling item. " +
                "It has CPU of "+cpu+". \nWith RAM of " +ram+ " GB and Storage Memory of "+storageMemory+
                "GB you will work faster and safer. \nThis model comes: \n Monitor: "+hasmonitor+ "" +
                "\n WiFi Card: "+ hasWIFIcard+ "\n Build-In Blutooth: "+ hasBluetooth+
                "\n Number of USB: "+usb+ "\n It is on sale for only $"+price+".");


    }


}
