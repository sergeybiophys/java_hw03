package org.itstep.task02;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        try{
            getPositiveLessHundredNumber(-10);
        }catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void getPositiveLessHundredNumber(int number) throws NegativeNumberException{
        if(number<0) throw new NegativeNumberException("number is negative...");
        if(number>100) throw new GreatHundredException("Number > 100 ");
    }
}
