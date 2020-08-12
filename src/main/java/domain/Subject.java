package domain;

import java.util.List;

public class Subject {
    private int subjectId;
    private List<Question> questionList;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public List<Question> getQuestion() {
        return questionList;
    }

    public void setQuestion(List<Question> question) {
        this.questionList = question;
    }
}
