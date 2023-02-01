package day12_switch;

public class Browsers {
    public static void main(String[] args) {
        String browser = "Safari";

                switch (browser){
                    case "chrome":
                        System.out.println("opening google in chrome");
                        break;
                    case "Safari":
                    case "firefox":
                            System.out.println("opening google in firefox");
                            break;
                    case    "safari" :
                        System.out.println("special set up for mac comps");
                        System.out.println("opening safari");
                        break;


                    default:
                        System.out.println("opening in chrome by default");
                break;

                }




    }

}
