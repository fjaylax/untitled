package day43_abstraction.hm_book;

public abstract class EBook extends Book implements Downloadable{
    double size;
    abstract void open();


}
