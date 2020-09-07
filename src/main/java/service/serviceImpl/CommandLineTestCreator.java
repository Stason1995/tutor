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
    public Test createTest() throws IOException {
        Test test = new Test();
        Subject subject = createSubject();
        boolean exit = true;

        List<Question> questionList = new ArrayList<>();
        while (exit) {
            System.out.println("Напиши новый вопрос! Чтобы закончить введи \"exit\"");
            String question = reader.readLine();
            if(!question.equals("exit")){
                questionList.add(createQuestion(question));
            } else exit = false;
        }
        test.setSubject(String.valueOf(subject.getSubjectName()));
        test.setQuestionList(questionList);
        return test;
    }

    public void writeText(String string){

        File text = new File("result.txt");
        try{
            PrintWriter writer = new PrintWriter (new BufferedWriter(new FileWriter(text, true)));
            writer.println(string);
            writer.close();
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
                writeText("Тест по алгебре!");
                break;
            }
            case INFORMATICS:{
                System.out.println("Ты выбрал Информатику");
                writeText("Тест по  информатике!");
                break;
            }
            case PHYSICS:{
                System.out.println("Ты выбрал Физику");
                writeText("Тест по физике!");
                break;
            }
        }
    }

    private Question createQuestion(String questions) throws IOException {
        List<Answer> answerList = new ArrayList<>();
        Question question = new Question();
        boolean exit = true;
        int counter = 1;


        question.setNameQuestion(questions);
        writeText("\n"+question.getNameQuestion()+"\n");


        while (exit) {
            System.out.println("Напиши "+counter+"-й вариант ответа! Чтобы создать новый вопрос введи \"exit\"");
            String answer = reader.readLine();
            if(!answer.equals("exit")){
                answerList.add(createAnswer(answer));
                counter ++;
            } else exit = false;
        }

        return question;
    }

    private Answer createAnswer(String possibleAnswer) throws IOException {
        Answer answer = new Answer();
        answer.setAnswer(possibleAnswer);
        writeText(possibleAnswer);

        return answer;
    }
}

