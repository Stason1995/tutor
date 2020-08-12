package domain;

import java.util.List;

public class Test {
    private int testId;
    private List <Subject> subjectList;

    public void setSubject(List<Subject> subject) {
        this.subjectList = subject;
    }
    public List<Subject> getSubject() {
        return subjectList;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }
}
