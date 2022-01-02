package org.itstep.task01;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        try{
            List tmpList = new List(2);
            tmpList.add(1);
            tmpList.add(2);
            tmpList.removeLast();
            tmpList.removeLast();
            tmpList.removeLast();

        }
        catch(FullListException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(EmptyListException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
