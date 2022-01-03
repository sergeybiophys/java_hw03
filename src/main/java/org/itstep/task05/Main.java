package org.itstep.task05;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        try{
            Runner newRunner = new Runner();
            newRunner.halt();
        }
        catch(RuntimeException ex)
        {
            System.out.println("**halt**");
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}
