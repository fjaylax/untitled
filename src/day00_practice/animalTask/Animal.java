package day00_practice.animalTask;

   public abstract class Animal {

    private String name; //we wil getters setters to control access
    private final String breed; //all for all, will be underlined red
    private final char gender;
    private int age;
    private String size;
    private final  String color;
    public  final static  boolean canBreath;

    static {
        canBreath = true;
        ; //final = it is unchangeable
// need to gen setter , but nor for final
    }
    // getter for everobody

     public Animal(String name, String breed, char gender, int age, String size, String color) {
            setName(name);
            this.breed = breed;
            if(!(gender=='M')|| (gender=='F')){
                throw new RuntimeException("Invalid gender "+gender);
            }
            this.gender = gender;
            setAge(age);
            setSize(size);
            this.color = color;
    }


    // need to gen constructor






    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;


        //methods

        //  public final void drink ()
        //{

        //  System.out.println(name + " is drinking"); }

        // public  abstract void eat();


        // }


    }}