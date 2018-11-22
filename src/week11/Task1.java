package week11;

public class Task1 {
    public static <t extends Comparable> void sapXep(t[] a){
        int n = a.length;
        boolean b = true;
        while (b)
        {
            b = false;
            for (int i = 0; i < n - 1; i++)
            {
                if (a[i].compareTo(a[i + 1]) > 0)
                {
                    t temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    b = true;
                }
            }
        }
        for(t s : a){
            System.out.println(s);
        }

    }


    public static void main(String[] args) {
        Integer[] a = {1, 5, 7, 8, 10,  11};
        sapXep(a);

        String [] s = {"a", "c", "d", "e", "f", "t"};
        sapXep(s);
    }
}
