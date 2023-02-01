package day43_abstraction.interface_hm;

public final class Target extends Shopping{
    @Override
    void buyItem() {
        System.out.println("buying target");

    }

    @Override
    void returnItem() {
        System.out.println("return to target");
    }
}
