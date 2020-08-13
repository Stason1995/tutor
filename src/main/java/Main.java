import domain.User;
import service.serviceImpl.CommandLineTestCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Привет! Давай познакомимся, напиши как тебя зовут");
        User user = new User();
        user.setName();
        System.out.println("Очень приятно, "+user.getName()+". Давай создадим с тобой тест");
        CommandLineTestCreator test = new CommandLineTestCreator();
        test.createTest();
    }
}
