package week7.task2;
import week7.task1.Division;

import java.io.*;
import java.math.BigDecimal;
public class Task2 {
    // NullPointerException
    // ArrayIndexOfBoundException
    // ArithmeticException
    // ClassCastExeption
    // IOException
    // FileNotFoundException
    public void toString(String s) throws NullPointerException{
        if(s == null){
            throw new NullPointerException();
        }
        System.out.println(s);
    }

    public void inPhanTuTaiN(int[] a, int n) throws ArrayIndexOutOfBoundsException{
        if(n >=a.length || n <0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(a[n]);
    }

    public void Division(int a, int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
    public void FindFile( File file) throws FileNotFoundException{
        FileReader f = new FileReader(file);
        throw new FileNotFoundException();
    }



    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try {
            String s = null;
            task2.toString(s);
        } catch (NullPointerException e) {
            System.out.println("lỗi chuỗi kí");
        }
        try{
            task2.Division(2, 0);
        } catch(ArithmeticException e){
            System.out.println("lỗi chia cho 0");
        }
        try {
            int[] array = {1, 2};
            task2.inPhanTuTaiN(array, 2);
        } catch (ArrayIndexOutOfBoundsException e){
           System.out.println( "lỗi vị trí phần tử cần in");
        }
        try{
            File file = new File("C:/word.txt");
            task2.FindFile(file);
        }
        catch (FileNotFoundException e){
            System.out.println("lỗi đọc file");
        }

//        try {
//            String s = "null";
//            task2.toString(s);
//            int a = 2;
//            int b =1;
//            int[] array = {1, 2};
//            int n = 2;
//            task2.inPhanTuTaiN(array, n);
//        }
//
//        catch (NullPointerException e) {
//            System.out.println("lỗi chuỗi kí tự trống");
//        }
//        catch(ArithmeticException e){
//            System.out.println("lỗi chia cho 0");
//        }
//        catch (Exception e){
//            System.out.println( "lỗi vị trí phần tử cần in");
//        }


    }
}
