package hello;

public class Greeting {
    private long id;
    private String firstName;
    private String lastName;

    //private final String token;
    public Greeting(long id, String firstName, String lastName/*, String content*/){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.content = content;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
