package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        try {
            Expression numeral1 = new Numeral(10);
            Expression square1 = new Square(numeral1);
            Expression numeral2 = new Numeral(2);
            Expression numeral3 = new Numeral(3);
            Expression addition1 = new Addition(numeral2, numeral3);
            Expression addition2 = new Addition(square1, addition1);
            Expression kq1 = new Square(addition2);
            System.out.println(kq1.toString());
            System.out.println(kq1.evaluate());
            Expression numeral4 = new Numeral(2);
            Expression numeral5 = new Numeral(2);
            Expression subtraction = new Subtraction(numeral4, numeral5);
            System.out.println(subtraction.toString());
            System.out.println(subtraction.evaluate());
            Expression division = new Division(numeral4, subtraction);
            System.out.println(division.toString());
            System.out.println(division.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
