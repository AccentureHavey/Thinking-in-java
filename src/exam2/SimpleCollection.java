package src.exam2;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i=1;i<10;i++) {


            c.add(i);
        }
        for(Integer a :c){
            System.out.println(a + ",");
        }
    }
}
