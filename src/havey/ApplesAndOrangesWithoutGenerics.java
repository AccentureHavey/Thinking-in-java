package havey;
import java.util.*;

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0;i<3;i++){
            apples.add(new Apple());
        }//Not prevented from adding an Orange to apples;
        for (int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
            //((Apple)apples.get(i)).id();
            //Orange is detected only at run time
        }
        for(Apple c : apples)
        {
            System.out.println(c.id());
        }

    }
}
