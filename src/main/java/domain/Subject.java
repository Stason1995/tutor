package domain;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private long id;
    private List<Test> testList;
    private SubjectName subjectName;


    public enum SubjectName{
        ALGEBRA, INFORMATICS, PHISICS, GEOMETRY, BIOLOGY
    }
    /*public void SubjectName(Subject.SubjectName id){
        switch (id){
            case ALGEBRA: List<Test> AlgebraList = new ArrayList<>();
            case INFORMATICS: List<Test> InformaticsList = new ArrayList<>();
            case PHISICS: List<Test> PhisicsList = new ArrayList<>();
            case GEOMETRY: List<Test> GeometryList = new ArrayList<>();
            case BIOLOGY: List<Test> BiologyList = new ArrayList<>();
        }
    }*/
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

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }
}
