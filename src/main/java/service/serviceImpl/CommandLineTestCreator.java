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

import static domain.Subject.SubjectName.*;

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
                SubjectName(Subject.SubjectName.ALGEBRA);
            case 2:
                SubjectName(Subject.SubjectName.INFORMATICS);
            case 3:
                SubjectName(PHISICS);
            case 4:
                SubjectName(GEOMETRY);
            case 5:
                SubjectName(BIOLOGY);
        }
        System.out.println("Ты выбрал: "+subject.getSubjectName());
        return subject;
    }

    public void SubjectName(Subject.SubjectName id){
        switch (id){
            case ALGEBRA: List<Test> AlgebraList = new ArrayList<>();
            case INFORMATICS: List<Test> InformaticsList = new ArrayList<>();
            case PHISICS: List<Test> PhisicsList = new ArrayList<>();
            case GEOMETRY: List<Test> GeometryList = new ArrayList<>();
            case BIOLOGY: List<Test> BiologyList = new ArrayList<>();
        }
    }

    private Question createQuestion() throws IOException {
        List<Answer> answerList = new ArrayList<>();
        System.out.println("Введите ваш вопрос");
        while (!reader.readLine().equals("exit")) {
            System.out.println("Введите ваш вариант ответа");
            answerList.add(createAnswer());
        }
        ///Введите вопрос бла-бла-бла
        ///ВВедите вариант ответа №1 ....
        //answerList.add(createAnswer());
        ///...
        return new Question();
    }

    private Answer createAnswer() throws IOException {
        List<Answer> answerList = new ArrayList<>();
        while (!reader.readLine().equals("exit")) {
            Answer answer = new Answer();
            answer.setAnswer(reader.readLine());
            System.out.println("Ты ввёл "+answer.getAnswer());
        }
        return new Answer();
    }

}

