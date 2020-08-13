package domain;

public class User {

    private enum Role{
        ADMIN, STUDENT
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
