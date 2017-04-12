package assignment;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by mnakada on 2017-04-12.
 */
public class Collections {
    public static void main(String ... args) {
        Set<String> mySet = new HashSet<String>();
        List<String> myList;
        myList = new ArrayList<String>();
        myList = new LinkedList<String>();
        Map<Integer,String> myMap = new HashMap<Integer,String>();

        mySet.add("momo");
        mySet.add("momo");
        mySet.add("gui");
        mySet.add("someone");

        myMap.put(1,"momo");
        myMap.put(3,"momo");
        myMap.put(22,"gui");
        myMap.put(100,"someone");
        myMap.put(100,"someone2");

        myList.add("momo");
        myList.add("momo");
        myList.add("gui");
        myList.add("someone");

        System.out.println("set:"+ Arrays.toString(mySet.toArray()));
        System.out.println("list:"+ Arrays.toString(myList.toArray()));
        System.out.println("map:"+myMap.toString());

        int a = 1;
        int[] b = {1};
        mymethod(a,a,a,a,a,a,a);
        mymethod(b);

        myMap.values().iterator().


    }

    public static void mymethod(int ... arr){
        System.out.println(Arrays.toString(arr));
    }
}
