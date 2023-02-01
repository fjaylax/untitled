package day41_exception.try_catch;

public class SecondTry {
    public static void main(String[] args) {

     try {

         int[] arr = {4, 2, 4, 1};
         System.out.println(arr[10]);

     }catch (IndexOutOfBoundsException e){
         System.out.println("CATCH BLOCK");


         e.printStackTrace();
         System.out.println(e.getMessage());
     }


    }
}
