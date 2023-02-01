package PracticePractice.CollinsHW10;

import java.util.ArrayList;

public class ArrayListAscendingDescending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       // sortAsc(list.add(10010));
        //arraylist.add(5);
       // arraylist.add(4);
       // arraylist.add(2);

    }
    public static ArrayList<Integer> sortAsc(ArrayList<Integer>arrayList){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = arraylist.size() - 1; j < i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {

                    int tmp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, tmp);
                }
            }
        }
        return arrayList;
    }


}
