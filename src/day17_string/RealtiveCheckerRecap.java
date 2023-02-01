package day17_string;

public class RealtiveCheckerRecap {
    public static void main(String[] args) {

String name1="James Bond";
String name2="Jamie Bond";
int indexOfSpace=name1.lastIndexOf(' ');//one character - space
String lastName=name1.substring(indexOfSpace+1); //name1.substring(indexOfSpace0.trim();
        if (name2.endsWith(lastName)){
            System.out.println("Related");

        }else{
            System.out.println("Not related");


        }
        System.out.println(name2.endsWith(lastName)?"Related":"Not related");




    }
}
