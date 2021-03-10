package kg.megacom.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    Integer[] arrList = { 3, 4, 5, 1, 1, 1, 7};

    List<Integer> myList = new LinkedList<>();
    int countShuffle = 0;
    public void sortNumbers(){
        myList = Arrays.asList(arrList);

        do {
            Collections.shuffle(myList);
            if(myList.get(0) == myList.get(1) && myList.get(1) == myList.get(2) ){


                break;

            }else {
                countShuffle++;
            }
        }while (true);
    }

    public void outputSortedList(){
        System.out.println(myList);
        System.out.println(countShuffle);
    }



}
