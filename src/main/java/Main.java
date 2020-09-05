import domain.Test;
import domain.User;
import service.serviceImpl.CommandLineTestCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Test> testList = new ArrayList<>();
        System.out.println("Привет! Давай познакомимся, напиши как тебя зовут");
        User user = new User();
        boolean exit = true;
        while (exit) {
           String name = reader.readLine();
            if (name != null && !name.isEmpty()) {
                user.setName(name);
                exit = false;
            } else
                System.out.println("Имя не может быть пустым! Попробуй ещё раз ;-)");
        }
        System.out.println("Очень приятно, "+user.getName()+". Давай создадим с тобой тест");
        CommandLineTestCreator test = new CommandLineTestCreator();

        testList.add(test.createTest());
        System.out.println(testList);
    }
}
