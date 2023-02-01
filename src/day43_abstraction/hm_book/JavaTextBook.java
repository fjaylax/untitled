package day43_abstraction.hm_book;

public class JavaTextBook extends EBook{

    boolean isFun;

    @Override
    public void read() {
        System.out.println("reading book");
    }

    @Override
    public void download() {
        System.out.println("Downloading EBook");
    }

    @Override
    void open() {
        System.out.println("Open EBook");
    }
}
