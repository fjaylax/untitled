package day21_nested_loops;

public class TriangleStar {
    public static void main(String[] args) {
        int term=8;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}


