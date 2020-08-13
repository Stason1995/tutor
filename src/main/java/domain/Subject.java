package domain;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private long id;
    private List<Test> testList;

    public enum idSubject{
        ALGEBRA, INFORMATICS, PHISICS, GEOMETRY, BIOLOGY
    }
    public void idSubject(idSubject id){
        switch (id){
            case ALGEBRA: List<Test> AlgebraList = new ArrayList<>();
            case INFORMATICS: List<Test> InformaticsList = new ArrayList<>();
            case PHISICS: List<Test> PhisicsList = new ArrayList<>();
            case GEOMETRY: List<Test> GeometryList = new ArrayList<>();
            case BIOLOGY: List<Test> BiologyList = new ArrayList<>();
        }
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
