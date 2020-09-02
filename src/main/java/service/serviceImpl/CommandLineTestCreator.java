package service.serviceImpl;

import domain.Answer;
import domain.Question;
import domain.Subject;
import domain.Test;
import service.TestCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        System.out.println("Чтобы создать вопрос нажми Enter. Если хочешь закончить - введи exit");
        while (!reader.readLine().equals("exit")) {
            questionList.add(createQuestion());
            System.out.println("Чтобы создать следующий вопрос нажми Enter. Если хочешь закончить - введи exit");
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
                SubjectName(ALGEBRA);
                break;
            case 2:
                SubjectName(INFORMATICS);
                break;
            case 3:
                SubjectName(PHISICS);
                break;
            case 4:
                SubjectName(GEOMETRY);
                break;
            case 5:
                SubjectName(BIOLOGY);
                break;
        }

        return subject;
    }

    public void SubjectName(Subject.SubjectName id){
        switch (id){
            case ALGEBRA: {
                System.out.println("Ты выбрал Алгебру");
                break;
            }
            case INFORMATICS:{
                System.out.println("Ты выбрал Информатику");
                break;
            }
            case PHISICS:{
                System.out.println("Ты выбрал Физику");
                break;
            }
            case GEOMETRY:{
                System.out.println("Ты выбрал Геометрию");
                break;
            }
            case BIOLOGY:{
                System.out.println("Ты выбрал Биологию");
                break;
            }
        }
    }

    private Question createQuestion() throws IOException {
        List<Answer> answerList = new ArrayList<>();
        Question question = new Question();
        System.out.println("Введите ваш вопрос");
        question.setNameQuestion(reader.readLine());
        System.out.println("Введите ваш вариант ответа");
        answerList.add(createAnswer());

        return question;
    }

    private Answer createAnswer() throws IOException {
        int countAnswer = 1;
        Map<Integer, String> answerMap = new HashMap<>();
        Answer answer = new Answer();
        boolean exit = true;
        while (exit) {
            String answerM = reader.readLine();
            if (!answerM.isEmpty() && !answerM.equals("exit")) {
                answerMap.put(countAnswer,answerM);
                countAnswer += 1;
                System.out.println("Введите следующий вариант или введите exit или нажми Enter");
            } else exit = false;
        }
        answer.setAnswer(answerMap);
        Set<Integer> keys = answerMap.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(answerMap.values());
        System.out.println("Значения: " + values);

        return answer;
    }
}

