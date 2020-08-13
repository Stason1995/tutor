package domain;

import java.util.Map;

public class Result {
    private long id;
    private Test test;
    private User user;
    private Map<Question,Answer> resultMap;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Map<Question, Answer> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<Question, Answer> resultMap) {
        this.resultMap = resultMap;
    }


}
