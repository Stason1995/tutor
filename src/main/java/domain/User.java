package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private enum Role{
        ADMIN, STUDENT
    }

    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName() throws IOException { //такого кода не должно быть в классах сущностях. Если хочешь проводить проверки - сделай  классы валидаторы, зоной ответственности которых будет проверка полей
        boolean exit = true;
        while (exit) {
            name = reader.readLine();
            if (name != null && !name.isEmpty()) {
                this.name = name;
                exit = false;
            } else
                System.out.println("Имя не может быть пустым! Попробуй ещё раз ;-)");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
