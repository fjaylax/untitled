package PracticePractice.CollinsHW10;

import java.util.ArrayList;

public class ArrayListSortingAscDesc1 {

        public static void main(String[] args) {

            ArrayList < Integer > arraylist = new ArrayList < Integer > ();

            arraylist.add(10010);
            arraylist.add(5);
            arraylist.add(4);
            arraylist.add(2);

            for (int i = 0; i < arraylist.size(); i++) {

                for (int j = arraylist.size() - 1; j >i; j--) {  //ass<>>dess
                    if (arraylist.get(i) < arraylist.get(j)) {

                        int tmp = arraylist.get(i);
                        arraylist.set(i,arraylist.get(j)) ;
                        arraylist.set(j,tmp);

                    }

                }

            }
           for (int i: arraylist) {
                System.out.println(i);
            }


        }}

