package week3;

//import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
      public  void testMax(){
          Week3 tm = new Week3();
          int a = tm.max(10, 5);
          int b = tm.max(12, 15);
          int c = tm.max(15, 13);
          int d = tm.max(16, 13);
          int e = tm.max(15, 12);
          Assert.assertEquals(10, a);
          Assert.assertEquals(15, b);
          Assert.assertEquals(15, c);
          Assert.assertEquals(16, d);
          Assert.assertEquals(15, e);
      }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
      public void testMinOfArray(){
          Week3 tm = new Week3();
          int a[] = {1, 2, 3, 4, 5};
          int b[] = {1, 0, 4, 6, 7, 8, 9};
          int c[] = {4, 5, 6, 2, 8, 9};
          int d[] = {17, 18, 12, 3, 7, 13};
          int e[] = {34, 35, 13, 45, 23, 45};
          int x = tm.minOfArray(a);
          int y = tm.minOfArray(b);
          int z = tm.minOfArray(c);
          int t = tm.minOfArray(d);
          int v = tm.minOfArray(e);
          Assert.assertEquals(1, x);
          Assert.assertEquals(0, y);
          Assert.assertEquals(2, z);
          Assert.assertEquals(3, t);
          Assert.assertEquals(13, e);
      }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testCalculateBMI(){
          Week3 tm = new Week3();
          Assert.assertEquals("Thua can", tm.calculateBMI(72, 1.70));
          Assert.assertEquals("Binh thuong", tm.calculateBMI(62, 1.67));
          Assert.assertEquals("Beo phi", tm.calculateBMI(83, 1.50));
          Assert.assertEquals("Thieu can", tm.calculateBMI(45, 1.70));
          Assert.assertEquals("Binh thuong", tm.calculateBMI(65, 1.75));
    }

}
