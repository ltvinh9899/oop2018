package week2.task1;

import static java.lang.System.*;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == b)
            return a;
        else {
            if(a>b)
                a = a - b;
            else
                b = b -a;
            return gcd(a,b);
        }
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 8;
        System.out.println("UCLN cua a va b la: " + gcd(a,b));
        int n = 6;
        System.out.println("day fibonaci: ");
        for(int i=0; i<n; i++)
         System.out.println(fibonacci(i));
    }
}
