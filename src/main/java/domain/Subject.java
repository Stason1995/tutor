package domain;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private long id;
    private SubjectName subjectName;

    public enum SubjectName{
        ALGEBRA, INFORMATICS, PHYSICS,
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
