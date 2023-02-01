package day41_exception.employee;

public  class Developer extends  Employee {

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);

    }

    @Override
    public void work() {
        System.out.println(getName() +"is working 8 h ");
    }

    @Override
    public void sleep() { //add something specific
        System.out.println(getName()+" is sleeping 8h");
    }
}
