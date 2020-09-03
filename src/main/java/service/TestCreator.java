package service;

import domain.Test;

import java.io.IOException;

public interface TestCreator {

    public Test createTest() throws IOException;
    public void writeText(String string);
}
