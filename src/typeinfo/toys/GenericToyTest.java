package typeinfo.toys;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //this won't compile;
        //Class<Toy> up2 = ftClass.getSuperclass();
        //Only produces Object;
        Object obj = up.newInstance();
    }
}
