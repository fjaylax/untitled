package day41_exception.employee;

public abstract class Person { //i it going to be parent -> abstract

    private String name; //the only way to get them through setters
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
       setName  (name);
        setAge  (age);
        setGender(gender);// i have setters to check  conditions
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException(("invalid age"+age));
        }
        this.age = age;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();// don't want to focus how many hours each people will sleep, everybody eats baklava

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void eat(){
    System.out.println(name+ "is eating baklava"); // i assume it for everybody // instance method






    }




}
