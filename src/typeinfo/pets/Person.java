package typeinfo.pets;
class Individual{
    private String id;
    public Individual(){}
    public Individual(String name) {}
    public String id(){
        return id;
    }
}

public class Person extends Individual {
    public Person(String name) {
        super(name);
    }
}
