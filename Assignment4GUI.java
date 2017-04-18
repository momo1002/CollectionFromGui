package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment4GUI {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year.(From 0 to 10000.)");
        int Y = scan.nextInt();

        Set<String> mySet = new HashSet<String>();
        for(int y = Y+1 ; y <= 10000 ; y++){
            String strNextYear = String.valueOf(y);
            for (int i = 0; i < strNextYear.length(); i++) {
                mySet.add(String.valueOf(strNextYear.charAt(i)));
            }
            if(mySet.size() == strNextYear.length()){
                    System.out.print(y);
                break;
            } else {
                mySet.clear();
            }
        }
    }
}
