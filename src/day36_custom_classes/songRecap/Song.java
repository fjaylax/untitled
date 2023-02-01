package day36_custom_classes.songRecap;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    //constructor
    public Song (String name, double length, String artist, String genge) {
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genge;

    }
    public Song (String name, double length){


    }
}
