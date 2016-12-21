package HomeWork;


public class User {
    private static long idVar = 1;
    private long id;
    private String name;

    public User(String name) {
        this.name = name;
        id = idVar;
        idVar++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
