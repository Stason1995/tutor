package service.serviceImpl;

import domain.Answer;
import domain.Question;
import domain.Subject;
import domain.Test;
import service.TestCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CommandLineTestCreator implements TestCreator {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public CommandLineTestCreator() {
    }

    @Override
    public Test createTest() throws IOException { //доделай методы
        Test test = new Test();

        Subject subject = createSubject();

        List<Question> questionList = new ArrayList<>();

        while (!reader.readLine().equals("exit")) {
            questionList.add(createQuestion());
        }

        test.setSubject(String.valueOf(subject.getSubjectName()));
        test.setQuestionList(questionList);
        return test;
    }

    private Subject createSubject() throws IOException {
        Subject subject = new Subject();
        System.out.println("Введи номер темы для теста: \n" +
                "1 - Алгебра\n" +
                "2 - Информатика\n" +
                "3 - Физика\n" +
                "4 - Геометрия\n" +
                "5 - Биология\n");
        int numberSubject = Integer.parseInt(reader.readLine());
        switch (numberSubject) {
            case 1:
                subject.idSubject(Subject.SubjectName.ALGEBRA);
            case 2:
                subject.idSubject(Subject.SubjectName.INFORMATICS);
            case 3:
                subject.idSubject(Subject.SubjectName.PHISICS);
            case 4:
                subject.idSubject(Subject.SubjectName.GEOMETRY);
            case 5:
                subject.idSubject(Subject.SubjectName.BIOLOGY);
        }
        return subject;
    }

    private Question createQuestion() {
        List<Answer> answerList = new ArrayList<>();

        ///Введите вопрос бла-бла-бла
        ///ВВедите вариант ответа №1 ....
        //answerList.add(createAnswer());
        ///...

        return new Question();
    }

    private Answer createAnswer() {
        List<Answer> answerList = new ArrayList<>();


        return new Answer();
    }

}

