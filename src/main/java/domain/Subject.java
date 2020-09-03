package domain;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private long id;
    private SubjectName subjectName;
    private List<Test> testList;

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public enum SubjectName{
        ALGEBRA, INFORMATICS, PHISICS,
    }
    public SubjectName getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
