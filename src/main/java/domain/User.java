package domain;

public class User {
    private enum Role{
        ADMIN, STUDENT
    }

    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
