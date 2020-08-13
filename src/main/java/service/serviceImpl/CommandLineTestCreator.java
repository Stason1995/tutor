package service.serviceImpl;

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
    public void createTest() throws IOException {
        Subject subject = new Subject();
        System.out.println("Введи номер темы для теста: \n" +
                "1 - Алгебра\n" +
                "2 - Информатика\n" +
                "3 - Физика\n" +
                "4 - Геометрия\n" +
                "5 - Биология\n");
        int numberSubject = Integer.parseInt(reader.readLine());
        switch (numberSubject){
            case 1: subject.idSubject(Subject.idSubject.ALGEBRA);
            case 2: subject.idSubject(Subject.idSubject.INFORMATICS);
            case 3: subject.idSubject(Subject.idSubject.PHISICS);
            case 4: subject.idSubject(Subject.idSubject.GEOMETRY);
            case 5: subject.idSubject(Subject.idSubject.BIOLOGY);
        }



    }
}

