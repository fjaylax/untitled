package PracticePractice.CollinsHW9;

public class ArrayConcatTwoArrays3 {
    public static void main(String[] args) {

            int a[] = {'1', '1', '2'};
            int b[] = {'2', '2', '6'};


            concat(a, b);
        }


        public static int[][] concat ( int a[], int b[]){
            int res[][] = new int[a.length][2];
            if (a.length != b.length) {
                throw new IllegalArgumentException("lenght are not equal, cannot perform");
            }
            for (int i = 0; i < a.length; i++) {
                res[i][0] = a[i];
                res[i][1] = b[i];
            }
            return res;
        }
    }
