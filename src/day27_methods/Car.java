package day27_methods;

public class Car {
    /* algorithm for using car:
    unlock the car
    open door
    sit down and start
    check mirrors
    seatbelt
    adjust seat
    put in D and go
     */


    public static void unlock() {

        System.out.println("Unlocking car");
    }

    public static void openDoor() {
        System.out.println("Opening door");
    }

    public static void sitAndStart() {
        System.out.println("Sitting down ina seat");
        System.out.println("Then insert the key");
        System.out.println("Start the car");
    }

    public static void checkMirrors() {
        System.out.println("Checking left mirror");
        System.out.println("Checking rear view mirror");
        System.out.println("checking right mirror");


    }

    public static void putzOnSeatBelt() {
        System.out.println("putting seatbelt");

    }

    public static void drive() {
        System.out.println("Putting in D");
        System.out.println("Pressing accelerator");


    }
    public static void late(){
        unlock();
        openDoor();
        sitAndStart();
        drive();
    }

    public static void main(String[] args) {
unlock();
openDoor();
sitAndStart();
checkMirrors();
putzOnSeatBelt();
drive();
        System.out.println("___________________________________");

late();


    }
}