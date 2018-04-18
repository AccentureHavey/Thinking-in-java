package exam1;

import havey.Apple;

import java.util.ArrayList;

public class GenericsAndUpcasting {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Rraeburn());
        for(Apple c : apples){
            System.out.println(c);
        }
    }
}
