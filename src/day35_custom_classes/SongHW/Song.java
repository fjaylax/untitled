package day35_custom_classes.SongHW;

public class Song {

     String name;
    double length;
    String artist;
    String genre;



    @Override
    public String toString() {
        return "Name of the Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +

                '}';
    }

    public Song(String inputName, String inputArtist, double inputLength, String inputGenre){
    this.name=inputName;
    this.length=inputLength;
    this.artist=inputArtist;
    this.genre=inputGenre;


}
    }
