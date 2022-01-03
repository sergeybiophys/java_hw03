package org.itstep.task03;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        try{
            Triangle t1 = new Triangle(1.0f, 2.0f, 4.0f);
        }
        catch (CreateTriangleException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
