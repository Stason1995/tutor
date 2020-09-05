package service.serviceImpl;

import domain.Answer;
import domain.Question;
import domain.Subject;
import domain.Test;
import service.TestCreator;

import java.io.*;
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

    public void writeText(String string){
        try(FileOutputStream text =new FileOutputStream("D:/result.txt", true)) // скрин скинул. Не у всех есть диск D (используй относительные пути). Храни файлы локально в папке проекта. Можешь сделать отдельный пакет.
        {
            // перевод строки в байты
            byte[] buffer = string.getBytes();

            text.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    private Subject createSubject() throws IOException {
        Subject subject = new Subject();
        System.out.println("Введи номер темы для теста: \n" +
                "1 - Алгебра\n" +
                "2 - Информатика\n" +
                "3 - Физика\n");
        int numberSubject = Integer.parseInt(reader.readLine());
        switch (numberSubject) {
            case 1:
                SubjectName(ALGEBRA);
                break;
            case 2:
                SubjectName(INFORMATICS);
                break;
            case 3:
                SubjectName(PHYSICS);
                break;
        }

        return subject;
    }

    public void SubjectName(Subject.SubjectName id){
        switch (id){
            case ALGEBRA: {
                System.out.println("Ты выбрал Алгебру");
                String n = "Тест по алгебре!" + "\n";
                writeText(n);
                break;
            }
            case INFORMATICS:{
                System.out.println("Ты выбрал Информатику");
                String n = "Тест по  информатике!" + "\n";
                writeText(n);
                break;
            }
            case PHYSICS:{
                System.out.println("Ты выбрал Физику");
                String n = "Тест по физике!" + "\n";
                writeText(n);
                break;
            }
        }
    }

    private Question createQuestion() throws IOException {
        List<Answer> answerList = new ArrayList<>();
        Question question = new Question();

        System.out.println("Введите ваш вопрос");
        question.setNameQuestion(reader.readLine());
        String n = question.getNameQuestion() + "\n";
        writeText(n);

        System.out.println("Чтобы создать варианты ответа нажми Enter. Если хочешь закончить - введи exit");
        while (!reader.readLine().equals("exit")) {
            answerList.add(createAnswer());
            System.out.println("Введите следующий вариант. Чтобы закончить введите exit или нажми Enter");
        }

        return question;
    }

    private Answer createAnswer() throws IOException { //Странная логика. Перепиши. Нужна связь вопроса и ответов. Вопрос должен в себе содержать список ответов.
        Answer answer = new Answer();
        System.out.println("Введите ваш вариант ответа");
        String possibleAnswer = reader.readLine();
        answer.setAnswer(possibleAnswer);
        possibleAnswer += "\n";
        writeText(possibleAnswer);

        return answer;
    }
}

