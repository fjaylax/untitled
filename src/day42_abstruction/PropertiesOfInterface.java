package day42_abstruction;

public interface PropertiesOfInterface { //change class to interface, no final, interface meant to be inherited

    //int a; //static and final only
    //static int b;//final by default
    //public PropertiesOfInterface (int a){
    //this.a=a;

    // }
    // static {
    // b=100;
    // }

    // public void method1(){
    // System.out.println("instance method");
    //}
    public static void method2() {
        System.out.println("Static method");
    }

    public abstract void method3();

    static void method5(){
  System.out.println("Default method"); // can use if u dont need var
}
     default void method4(){
    System.out.println("Default method");// u dont have to override , can implement

}
        }
