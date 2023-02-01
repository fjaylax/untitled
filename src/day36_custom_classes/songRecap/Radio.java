package day36_custom_classes.songRecap;

public class Radio {
    public static void main(String[] args) {
        Song song = new Song("ColdPlay", 3.5, "Clocks", "pop");
        System.out.println(song);


        Song song1 = new Song("Four Season", 2.8);
        System.out.println(song1);
    }
}
