package day34_custom_classes.app;

public class App {

  String name;
  double version;
  boolean isFree;
  int ratings;
   public void update(){
     System.out.println(name+ "Is updating");
     version += 0.1;



   }

    public String toString(){
        return "Name: " + name +"\nVersion: " + version +"\nis Free: " + isFree + "\nRatings:" + ratings;
    }

}
