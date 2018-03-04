package hello;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
    public List<Greeting> getPps() {
        return pps;
    }

    private List<Greeting> pps;
    public PeopleList(){
        pps = new ArrayList<>();
        Greeting person;
        pps.add(person = new Greeting(1,"Johnny","Kowalski"));
        pps.add(person = new Greeting(2,"Bobby","Ross"));
        pps.add(person = new Greeting(3,"Dale","Cooper"));
        pps.add(person = new Greeting(4,"Audrey","Horne"));
        pps.add(person = new Greeting(5,"Laura","Palmer"));
        pps.add(person = new Greeting(6,"Pink","Freud"));
    }

    public Greeting getPosition(int i){
        return pps.get(i);
    }




}
